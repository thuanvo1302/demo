package lab7;
public class Fraction{
    private int numerator;
    private int denominator;
    public Fraction(int num, int den){
        this.numerator = num;
        this.denominator = den;
    }
    public Fraction reducer(){
    int gcd = this.gcd(this.numerator, this.denominator);
        return new Fraction(this.numerator/gcd, this.denominator/gcd);
    }
    private int gcd(int num, int den){
        while(num != den){
            if(num > den){
                num -= den;
            }else{
                den -= num;
            }
        }
        return num;
    }
    @Override
    public boolean equals(Object obj) {
    if(obj instanceof Fraction){
        Fraction temp = (Fraction) obj;
        temp = temp.reducer();
        Fraction temp1 = this.reducer();
        if(temp.numerator == temp1.numerator && temp.denominator == temp1.denominator){
            return true;
        }
    }
    return false;
    }
}