import java.util.Scanner;

public class Ex3 {
    public static double caua_recur(int n){
        if(n==0) return 2;
        return 2-0.5*caua_recur(n-1);
    }
    public static double caua_iter(int n){
        double res=2;
        for(int i=1;i<=n;i++){
            res=2-0.5*res;
        }
        return res;
    }
    public static double caub_resur(int n){
        if(n<10) return 1;
        return 1+caub_resur(n/10);
    }
    public static double caub_iter(int n){
        double res=1;
        while(n>10){
            res=1+res;
            n=n/10;
        }
        return res;
    }
    public static double cauc_recur(int n, int k){
        if(k==1) return n;
        return n+cauc_recur(n, k-1);
    }
    public static int cauc_iter(int n, int k){
        int res=0;
        for(int i=1;i<=k;i++ ){
            res=n+res;
        }
        return res;
    }
    public static double caud_recur(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return caud_recur(n-1)+caud_recur(n-2);
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n= ");
        int n= sc.nextInt();
        //cau a
        System.out.println(caua_recur(n));
        System.out.println(caua_iter(n));
        //cau b
        System.out.println(caub_resur(n));
        System.out.println(caub_iter(n));
        System.out.println("Enter k");
        int k=sc.nextInt();
        sc.close();
        //cau c
        System.out.println(cauc_recur(n, k));
        System.out.println(cauc_iter(n, k));
        //cau d
        System.out.println(caud_recur(n));
    }
}
