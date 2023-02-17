package lap1;
import java.util.Scanner;

public class lap1_b11
{
    public static int remainder(int a,int b){
        return a%b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        int n = sc.nextInt();
        System.out.println("Input second number");
        int x = sc.nextInt();
        System.out.println("The remainder of a division: "+remainder(n,x));

        

    }
}