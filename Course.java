 class Course {

    int courseId;
    String courseName;
    double courseFee;

    Course(int courseId, String courseName, double courseFee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;
    }
    int getCourseId() { return courseId; }
    String getCourseName() { return courseName; }
    double getCourseFee() { return courseFee; }
    public String toString() {
        return "GNC | Course ID=" + courseId + " | " + courseName + " | " + courseFee;
    }
}
