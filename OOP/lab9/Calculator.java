package lab9;

import javafx.scene.chart.CategoryAxis;

public class Calculator{
    private int a;
    private int b;
    public Calculator(){}
    public Calculator(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public double divide(int a, int b)
    {
        int res = a/b;
        return res;
    }
    public int multiply(int a, int b)
    {
        int res = a*b;
        return res;
    }
    @Override
    public String toString()
    {
        return this.a+"_"+this.b;
    }
}