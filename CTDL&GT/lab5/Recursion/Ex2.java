import java.util.Scanner;
public class Ex2 {
    public static double caua_recur(int n){
        if(n==1) return 2;
        return Math.pow(2,n)+caua_recur(n-1);
    }
    public static double caua_iter(int n){
        double res=2;
        for(int i=2;i<=n;i++){
            res=res+Math.pow(2, i);
        }
        return res;
    }
    public static double caub_resur(int n){
        if(n==0) return 0.5;
        return (double)(n+1)/2 + caub_resur(n-1);
    }
    public static double caub_iter(int n){
        double res=0.5;
        for(int i=1;i<=n;i++){
            res=res+(double)(i+1)/2;
        }
        return res;
    }
    public static int giaithua(int n){
        if(n==1 || n==0) return 1;
        return n*giaithua(n-1);
    }
    public static int cauc_recur(int n){
        if(n==1) return 1;
        return giaithua(n)/giaithua(n-1)+cauc_recur(n-1);
    }
    public static int cauc_iter(int n){
        int res=1;
        for(int i=2;i<=n;i++){
            res=res+giaithua(i)/giaithua(i-1);
        }
        return res;
    }
    public static int caud_recur(int n){
        if(n==1) return 0;
        return n*(n-1)+caud_recur(n-1);
    }
    public static int caud_iter(int n){
        int res=0;
        for(int i=2;i<=n;i++){
            res=res+(i*(i-1));
        }
        return res;
    }
    public static int caue_recur(int n){
        if(n==1) return 1;
        return n*caue_recur(n-1);
    }
    public static int caue_iter(int n){
        int res=1;
        for(int i=2;i<=n;i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n= ");
        int n= sc.nextInt();
        sc.close();
        //cau a
        System.out.println(caua_recur(n));
        System.out.println(caua_iter(n));
        //cau b
        System.out.println(caub_resur(n));
        System.out.println(caub_iter(n));
        //cau c
        System.out.println(giaithua(n));
        System.out.println(cauc_recur(n));
        System.out.println(cauc_iter(n));
        //cau d
        System.out.println(caud_recur(n));
        System.out.println(caud_iter(n));
        //cau e
        System.out.println(caue_recur(n));
        System.out.println(caue_iter(n));
    }
}
