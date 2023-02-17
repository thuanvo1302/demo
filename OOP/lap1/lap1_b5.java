package lap1;
import java.util.Scanner;

public class lap1_b5 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input first number ");
        double a = sc.nextDouble();
        System.out.println("Input second number ");
        double b = sc.nextDouble();
        System.out.println("Input third number ");
        double c = sc.nextDouble();
        double min =a;
        if(b<a){
            min=b;
        }
        if(c<a){
            min=c;
        }
        System.out.println("Minimum between three numbers: "+min);

    }
    
}
