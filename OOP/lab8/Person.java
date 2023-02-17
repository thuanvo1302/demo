package lab8;

public class Person {
    protected String name;
    protected int birthyear;
    public Person(){}
    public Person(String name, int birthyear){
        this.name=name;
        this.birthyear=birthyear;
    }
    public String getName()
    {
        return this.name;
    }
    public int getBirthYear()
    {
        return this.birthyear;
    }
    public void setName(String Name)
    {
        this.name=Name;
    }
    public void setBirthYear(int birthyear)
    {
        this.birthyear= birthyear;
    }
    public String toString()
    {
        return "name"+this.name+"birthyear"+this.birthyear+"";
    }
}
