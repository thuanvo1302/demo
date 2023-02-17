package lap4;

public class Fractiontest {
    public static void main( String[] args)
    {
        Fraction f1 = new Fraction(2,3);
        System.out.printf("phan so: %d/%d\n",f1.getNum(),f1.getDen());
        Fraction f2 = new Fraction();
        System.out.printf("phan so: %d/%d\n",f2.getNum(),f2.getDen());
        f1.add(f2);
        f1.sub(f2);
        f1.mul(f2);
        f1.div(f2);
    }
}
