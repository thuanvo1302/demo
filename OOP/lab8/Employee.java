package lab8;

public class Employee extends Person {
    protected int id;
    protected int salary;
    public Employee(){}
    public Employee(String name, int birthyear, int id, int salary)
    {
        super(name,birthyear);
        this.id = id;
        this.salary=salary;
    }
    public int getId()
    {
        return this.id;
    }
    public int getSalary()
    {
        return this.salary;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public String toString()
    {
        return "name"+this.name+"birthyear"+this.birthyear+"id"+this.id+"salary"+this.salary+"";
    }
}
