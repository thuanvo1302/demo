package lab7;

public class TestFraction {
    public static void main(String[] args){
        Fraction f = new Fraction(3, 4);
        Fraction f1 = new Fraction(6, 8);
        Fraction f2 = new Fraction(3, 2);
        System.out.println(f.equals(f1));
        System.out.println(f.equals(f2));
    }
}
