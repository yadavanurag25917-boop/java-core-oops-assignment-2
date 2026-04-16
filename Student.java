class Student {

    int rollno;
    String sName;
    String sEmail;

    Student(int rollno, String sName, String sEmail) {
        this.rollno = rollno;
        this.sName = sName;
        this.sEmail = sEmail;
    }

    int getRollno() {
        return rollno;
    }

    String getSName() {
        return sName;
    }

    String getSEmail() {
        return sEmail;
    }

    public String toString() {
        return "GNC | ID=" + rollno + " | " + sName + " | " + sEmail;
    }
}
