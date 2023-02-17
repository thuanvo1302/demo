import java.util.Scanner;
public class Cau2 {
    public static int recur(int n, int k) {
        // code here
        if(k==0) return 1;
        return n*recur(n, k-1);
    }

    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter n=");
        int n=sc.nextInt();
        System.out.println("Enter k=");
        int k=sc.nextInt();
        sc.close();
        System.out.println(recur(n, k));
	}
}