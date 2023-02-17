abstract class Employee {
    protected int ID;
    protected String fullName;
    protected String mail;
    protected String phoneNumber;
    protected double baseSalary;
    protected Project currentProject;

    public Employee() {

    }

    public Employee(int id, String fullName, String mail, String phoneNumber, double baseSal) {
        super();
        this.ID = id;
        this.fullName = fullName;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.baseSalary = baseSal;
    }

    public int getID() { return this.ID; }

    public String getFullName() { return this.fullName; }

    public String getMail() { return this.mail; }

    public String getPhoneNumber() { return this.phoneNumber; }

    public double getBaseSalary() { return this.baseSalary; }

    public void setID(int id) { this.ID = id; }

    public void setMail(String mail) { this.mail = mail; }

    public void setPhoneNumber(String number) { this.phoneNumber = number; }

    public void setBaseSalary(double baseSal) { this.baseSalary = baseSal; }

    abstract String getRank();

    public double getBonus() {
        String rank = getRank();
        if (rank.equals("D")) return 0;
        if (rank.equals("C")) return baseSalary*5/100;
        if (rank.equals("B")) return baseSalary*10/100;
        if (rank.equals("A")) return baseSalary*25/100;
        return 0;
    }

    abstract double getSalary();

    public void assignedToProject(Project project) {
        if (this.currentProject != null) { // Khong giao viec khi dang lam project khac
            System.out.println("Cannot assign. This employee is busy.");
            return;
        }
        this.currentProject = project;
        project.setNumberOfWorker(project.getNumberOfWorker() + 1); // Tang so nguoi thuc hien project
    }

    public void removedFromProject() {
        if (this.currentProject == null) return;
        this.currentProject.setNumberOfWorker(this.currentProject.getNumberOfWorker()-1);
        this.currentProject = null;
    }

    public void printInfo() {
        System.out.println("Employee ID: " + ID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + mail);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Rank: " + getRank());
        System.out.println("Base salary: " + baseSalary);
        System.out.println("Salary: " + getSalary());
        if (currentProject == null) System.out.println("Status: Free of work");
        else System.out.println("Status: Busy");
    }

    abstract void work();
}
