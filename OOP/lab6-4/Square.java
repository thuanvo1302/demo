package java.lab6;

public class Square extends Rectangle {
    public Square()
    {

    }
    public Square(double side)
    {
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled)
    {
        this.width = side;
        this.length = side;
        this.color= color;
        this.filled = filled;
    }
    public double getSide()
    {
        return this.width;
    }
    public void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    @Override
    public void setColor(String color)
    {
        System.out.print("red");
    }
    @Override
    public String toString()
    {
        return "Square"+getSide()+"";
    }
}
