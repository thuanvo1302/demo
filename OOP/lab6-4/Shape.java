package java.lab6;
public class Shape{
    protected String color= "red";
    protected boolean filled = true;
    public Shape(){
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public boolean isFilled()
    {
        return this.filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    @Override
    public String toString()
    {
        return "Color"+this.color+"filled"+this.filled+"";
    }
}
