import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        CampusSystem campus = new CampusSystem();
        int choice;

        do {
        System.out.println("\n=== GNC SmartCampus ===");
         System.out.println("1. Add Student");
        System.out.println("2. Add Course");
         System.out.println("3. Enroll Student");
        System.out.println("4. View Students");
            System.out.println("5. View Enrollments");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
            System.out.print("Enter ID: ");
                int sid = sc.nextInt();
             System.out.print("Enter Name: ");
                    String sname = sc.next();
                 System.out.print("Enter Email: ");
                 String semail = sc.next();
                    campus.addStudent(sid, sname, semail);
                    break;

                case 2:
                System.out.print("Enter Course ID: ");
                int cid = sc.nextInt();
                System.out.print("Enter Course Name: ");
                String cname = sc.next();
                  System.out.print("Enter Fee: ");
                double fee = sc.nextDouble();
                    try {
                        campus.addCourse(cid, cname, fee);
                    } catch (InvalidFeeException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                System.out.print("Enter Student ID: ");
                    int esid = sc.nextInt();
                 System.out.print("Enter Course ID: ");
                  int ecid = sc.nextInt();
                    campus.enrollStudent(esid, ecid);
                    break;

                case 4:
                    campus.viewStudents();
                    break;

                case 5:
                    campus.viewEnrollments();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}
