public class Student {
    private double mathematics;
    private double programming;
    private double DSA1;
    private String name;

    public Student() {
    };

    public Student(String name, double mathematics, double programming, double DSA1) {
        this.mathematics = mathematics;
        this.programming = programming;
        this.DSA1 = DSA1;
        this.name = name;
    }

    public double avg() {
        return ((this.mathematics + this.programming + this.DSA1) / 3);
    }

    @Override
    public String toString() {
        return this.name + " " + this.mathematics + " " + this.programming + " " + this.DSA1;
    }

}
