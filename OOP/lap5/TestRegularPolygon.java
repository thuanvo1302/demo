package lap5;

public class TestRegularPolygon {
    public static void main( String args[])
    {
        RegularPolygon re1 = new RegularPolygon();
        RegularPolygon re2 = new RegularPolygon("q1",4,4);
        System.out.println(re1);
        System.out.println(re2);
        System.out.println(re2.getArea());
        System.out.println(re2.getName());
        System.out.println(re2.getEdgeAmount());
        System.out.println(re2.getEdgeLength());
        System.out.println(re2.getPerimeter());
        System.out.println(re2.getPolygon());







    }
}
