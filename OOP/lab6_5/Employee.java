package lab6_5;

public class Employee {
    protected String ID;
    protected String fullName;
    protected int yearJoined;
    protected double coeffcientsSalary;
    protected int numDayOff;
    protected int baseSalary = 1150;
    public Employee()
    {
        this.ID = "0";
        this.fullName ="";
        this.yearJoined=2020;
        this.coeffcientsSalary = 1.0;
        this.numDayOff = 0;
    }
    public Employee(String ID, String fullName, double coeffcientsSalary)
    {
        this.ID = ID;
        this.fullName = fullName;
        this.coeffcientsSalary = coeffcientsSalary;
        this.yearJoined = 2020;
        this.numDayOff = 0;
    }
    public Employee(String ID, String fullName, int yearJoined ,double coeffcientsSalary, int numDayOff)
    {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coeffcientsSalary = coeffcientsSalary;
        this.numDayOff = 0;
    }
    public double getSeniority()
    {
        if(2022 - this.yearJoined >5)
        {
            return (2022 - this.yearJoined)*baseSalary/100;
        }
        return 0 ;
    }
    public String considerEmulation()
    {
        if(this.numDayOff <=1) return "A";
        if(this.numDayOff <=3) return "B";
        return "C";
    }
    public double getSalary()
    {
        if(considerEmulation()=="A") return (this.baseSalary)+this.baseSalary*(this.coeffcientsSalary+ 1.0) + getSeniority();
        if(considerEmulation()=="B") return (this.baseSalary)+this.baseSalary*(this.coeffcientsSalary+ 0.75) + getSeniority();
        return (this.baseSalary)+this.baseSalary*(this.coeffcientsSalary+ 0.5) + getSeniority();
    }
    
}
