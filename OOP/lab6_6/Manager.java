package lab6_6;

import lab6_5.Employee;

public class Manager extends Employee {
    private String position;
    private String department;
    private double salarcoefficient;
    public Manager()
    {
        this.position = "head of the office";
        this.department = "administrative office";
        this.salarcoefficient = 5.0;
    }
    public Manager(String ID, String fullName, double coeffcientsSalary, String position, double salarcoefficient, int yearJoined, int numDayOff)
    {
        super(ID, fullName, coeffcientsSalary);
        this.position = position;
        this.salarcoefficient = salarcoefficient;
        this.yearJoined = 2020;
        this.numDayOff = 0;
    }
    public Manager(String ID, String fullName, double coeffcientsSalary,  int yearJoined, int numDayOff, String position,String department, double salarcoefficient)
    {
        super(ID, fullName, yearJoined, coeffcientsSalary, numDayOff);
        this.position = position;
        this.department = department;
        this.salarcoefficient= salarcoefficient;
    }
    public String considerEmulation()
    {
        return "A";
    }
    public double bonusByPosition()
    {
        return this.baseSalary*salarcoefficient;
    }
    public double getSalary()
    {
        return this.baseSalary+this.baseSalary*(salarcoefficient+ 1.0)+bonusByPosition();
    }

}
