package lab8;

public class Student extends Person {
    protected int id;
    protected int score;
    public Student(){}
    public Student(String name, int birthyear,int id, int score)
    {
        super(name,birthyear);
        this.id=id;
        this.score=score;
    }
    public int getId()
    {
        return this.id;
    }
    public int getScore()
    {
        return this.score;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setScore(int score)
    {
        this.score=score;
    }
    public String toString()
    {
        return "name"+this.name+"birthyear"+this.birthyear+"id"+this.id+"score"+this.score+"";
    }
}
