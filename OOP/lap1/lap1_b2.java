package lap1;
import java.util.Scanner;



public class lap1_b2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in); 
        System.out.println("input base");
        double base = sc.nextDouble();
        System.out.println("input height");
        double height = sc.nextDouble();
        double area = (base*height)/2;
        System.out.printf("Area: %.2f", area);
    }
}
