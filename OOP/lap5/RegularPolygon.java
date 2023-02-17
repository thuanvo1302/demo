package lap5;

public class RegularPolygon {
    private String name;
    private int edgeAmount;
    private double edgeLength;
    public RegularPolygon()
    {
        this.name="";
        this.edgeAmount=3;
        this.edgeLength=1;
    }
    public RegularPolygon(String name,int edgeAmount,double edgeLength)
    {
        this.name=name;
        this.edgeAmount=edgeAmount;
        this.edgeLength=edgeLength;
    }
    public RegularPolygon(String name, int edgeAmount)
    {
        this.name= name;
        this.edgeAmount=edgeAmount;
        this.edgeLength=1;
    }
    public RegularPolygon(RegularPolygon polygon)
    {
        this.name=polygon.name;
        this.edgeAmount=polygon.edgeAmount;
        this.edgeLength=polygon.edgeLength;
    }
    public String getName()
    {
        return this.name;
    }
    public int getEdgeAmount()
    {
        return this.edgeAmount;
    }
    public double getEdgeLength()
    {
        return this.edgeLength;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setEdgeAmount(int num)
    {
        this.edgeAmount=num;
    }
    public void setEdgeLength(double length)
    {
        this.edgeLength= length;
    }
    public String getPolygon()
    {
        String a="";
        if(this.edgeAmount==3)
        {
            a= "Triangle";
        }
        if(this.edgeAmount==4)
        {
            a= "Quadrangle";
        }
        if(this.edgeAmount==5)
        {
            a= "Pentagon";
        }
        if(this.edgeAmount==6)
        {
            a= "Hexagon";
        }
        if(this.edgeAmount>6)
        {
            a= "Polygon has the number of edges greater than 6";
        }
        return a;

    }
    public double getPerimeter()
    {
        return this.edgeLength*this.edgeLength;
    }
    public double getArea()
    {
        double area=1;
        if(edgeAmount==3)
        {
            area=(edgeLength*edgeLength)*0.433;
        }
        if(edgeAmount==4)
        {
            area=(edgeLength*edgeLength)*1;
        }
        if(edgeAmount==5)
        {
            area=(edgeLength*edgeLength)*1.72;
        }
        if(edgeAmount==6)
        {
            area=(edgeLength*edgeLength)*2.595;
        }
        if(edgeLength>6)
        {
            area=-1;
        }
        return area;
        

    }
    @Override
        public String toString()
        {
            String a =name +"-"+ this.getPolygon()+"-"+ this.getArea();
            return a;
        }
}
