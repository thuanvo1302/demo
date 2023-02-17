package java.lab6;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;
    public Rectangle()
    {
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color,boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth()
    {
        return this.width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getLength()
    {
        return this.length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    public double getArea()
    {
        return this.length*this.width;
    }
    public double getPerimeter()
    {
        return 2*(this.length+this.width);
    }
    @Override
    public String toString()
    {
        return "width"+this.width+"length"+this.length+"";
    }
}

