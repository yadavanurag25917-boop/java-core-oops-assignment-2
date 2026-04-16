import java.util.ArrayList;
import java.util.HashMap;

class CampusSystem {

    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Course> courseList = new ArrayList<>();
    HashMap<Integer, ArrayList<Course>> enrollMap = new HashMap<>();

    void addStudent(int id, String name, String email) {
        studentList.add(new Student(id, name, email));
        System.out.println("Student added: " + name);
    }

    void addCourse(int id, String name, double fee) throws InvalidFeeException {
        if (fee < 0) {
            throw new InvalidFeeException("Fee cannot be negative: " + fee);
    }
        courseList.add(new Course(id, name, fee));
        System.out.println("Course added: " + name);
    }
void enrollStudent(int sId, int cId) {
        Student s = null;
        Course c = null;

        for (Student st : studentList) {
            if (st.getRollno() == sId) s = st;
        }
        for (Course co : courseList) {
            if (co.getCourseId() == cId) c = co;
        }

        if (s == null) { System.out.println("Student not found!"); return; }
        if (c == null) { System.out.println("Course not found!"); return; }

        enrollMap.putIfAbsent(sId, new ArrayList<>());
        enrollMap.get(sId).add(c);
        System.out.println(s.getSName() + " enrolled in " + c.getCourseName());

        Thread t = new Thread(new EnrollmentProcessor(s.getSName(), c.getCourseName()));
        t.start();
    }

    void viewStudents() {
        for (Student s : studentList) System.out.println(s);
    }

    void viewEnrollments() {
        for (int id : enrollMap.keySet()) {
            System.out.println("Student ID: " + id);
            for (Course c : enrollMap.get(id)) {
                System.out.println("   -> " + c);
            }
        }
    }
}