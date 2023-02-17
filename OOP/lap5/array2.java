package lap5;

import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static int prodOdd(int[] a)
    {
        int p=1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                p*=a[i];
            }
        }
        return p;
    }
    public static int idxFirstEven(int[] a)
    {
        int d=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                d=i;
                break;
            }
        }
        return d;
    }
    public static int idxLastOdd(int[] a){
        int d=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                d=i;
            }
        }
        return d;
    }
    public static int[] input(int n)
    {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("input "+(i+1));
            a[i]=sc.nextInt();
        }
        sc.close();
        return a;
    }
    public static void main(String args[])
    {
        int[] a={1,2,3,4,9,6,8,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n=");
        int n = sc.nextInt();
        System.out.println(prodOdd(a));
        System.out.println(idxFirstEven(a));
        System.out.println(idxLastOdd(a));
        System.out.println(Arrays.toString(input(n)));
    }

    
}
