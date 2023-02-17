package java.lab6;

public class Circle extends Shape {
    protected double radius = 1.0;
    public Circle()
    {
        this.radius = 1.0;
    }
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double width)
    {
        this.radius = width;
    }
    public double getArea()
    {
        return this.radius*this.radius*2*3.14;
    }
    public double getPerimeter()
    {
        return this.radius*2*3.14;
    }
    @Override
    public String toString()
    {
        return "radius"+this.radius+"Area"+getArea()+"perimeter"+getPerimeter()+"";
    }
}
