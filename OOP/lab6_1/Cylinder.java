package lab6_1;

public class Cylinder extends Circle{
    private double height= 1.0;
    public Cylinder(){}
    public Cylinder(double radius){super(radius);}
    public Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color)
    {
        super(radius,color);
        this.height = height;
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getVolume()
    {
        return 3.14*this.radius*this.radius*this.height;
    }
    @Override
    public String toString()
    {
        return "radius"+this.radius+"height"+this.height+"color"+this.color+"";
    }

}
