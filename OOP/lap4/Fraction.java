package lap4;

public class Fraction {
    private int num;
    private int den;
    private float Fraction;
    
    public Fraction()
    {
        this.num = 1;
        this.den = 2;
    }
    public Fraction(int num,int den)
    {
        this.num = num;
        this.den = den;
    }
    public Fraction(float Fraction)
    {
        this.Fraction = Fraction;
    }
    public int getNum()
    {
        return this.num;
    }
    public int getDen()
    {
        return this.den;
    }
    public void add(Fraction fraction)
    {
        int tu = this.num* fraction.den + fraction.num*this.den;
        int mau = this.num * fraction.den; 
        Fraction tongphanso = new Fraction(tu,mau);
        System.out.println("Tong phan so "+tongphanso.num+"/" + tongphanso.den);
    }
    public void sub(Fraction fraction)
    {
        int tu = this.num* fraction.den - fraction.num*this.den;
        int mau = this.num * fraction.den; 
        Fraction hieuphanso = new Fraction(tu,mau);
        System.out.println("Hieu phan so "+hieuphanso.num+"/" + hieuphanso.den);
    }
    public void mul (Fraction fraction)
    {
        int tu = this.num* fraction.num ;
        int mau = this.den * fraction.den; 
        Fraction tichphanso = new Fraction(tu,mau);
        System.out.println("Tich phan so "+tichphanso.num+"/" + tichphanso.den);
    }
    public void div(Fraction fraction)
    {
        int tu = this.num* fraction.den;
        int mau = this.den * fraction.num; 
        Fraction thuongphanso = new Fraction(tu,mau);
        System.out.println("Chia phan so "+thuongphanso.num+"/" + thuongphanso.den);
    }
}
