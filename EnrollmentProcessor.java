 class EnrollmentProcessor implements Runnable {

    String sName;
    String cName;
 EnrollmentProcessor(String sName, String cName) {
        this.sName = sName;
        this.cName = cName;
    }
 public void run() {
        System.out.println("[Processing] " + sName + " -> " + cName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
        System.out.println("[Done] " + sName + " enrolled in " + cName);
    }
}