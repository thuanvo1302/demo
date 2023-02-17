public class Fraction {
    private int number;
    private int demon;

    public Fraction() {
        this.number = 0;
        this.demon = 1;
    }

    public Fraction(int number, int demon) {
        this.number = number;
        this.demon = demon;
    }

    public Fraction(Fraction f) {
        this.number = f.number;
        this.demon = f.demon;
    }

    public String toString() {
        return this.number + "/" + this.demon;
    }

    public static int findUCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public boolean equals(Fraction f) {
        if (this.demon == f.demon) {
            if (this.number == f.number) {
                return true;
            } else {
                return false;
            }
        } else {
            int ucln = findUCLN(this.demon, f.demon);
            this.demon *= ucln;
            this.number *= ucln;
            f.demon *= ucln;
            f.number *= ucln;

            if (this.number == f.number) {
                return true;
            } else {
                return false;
            }

        }
    }
}
