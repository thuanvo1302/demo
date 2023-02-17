import java.util.Scanner;

public class Ex1{
    public static double prod_recur(int a, int b){
        if(a==1 && b==1) return 1;
        return a*prod_recur(b, 1);
    }
    public static void main(String[] agrs){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a= ");
        int a= sc.nextInt();
        System.out.println("Enter b= ");
        int b=sc.nextInt();
        sc.close();
        System.out.println(prod_recur(a, b));
    }
}