package lap4;
public class Student{
    private String firstName;
    private String lastName;
    private int id;
    public Student(int id, String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    public int getID()
    {
        return this.id;
    }
    public String getFisrtName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public void setID(int id)
    {
        this.id = id;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getName()
    {
        return this.lastName+this.firstName;
    }
    @Override
    public String toString()
    {
        return "Student["+ id +","+ firstName +","+ lastName +"]";
    }
}

