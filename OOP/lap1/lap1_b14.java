package lap1;
import java.util.Scanner;

public class lap1_b14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int n = sc.nextInt();
        int temp = n;
        int a;
        int s=0;
        while(n>0){
            a = n%10;
            s = (s*10)+a;
            n/=10;
        }
        if(s==temp){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not  palindrome");
        }
    }
}
