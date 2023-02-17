package b567;

import java.util.Scanner;

public class b567 {
 
    public static int snt(int a)
{
    int dem=0;
    for(int i=1;i<=a;i++)
    {
        if(a%i == 0)
        {
            dem++;
        }
    }
    if(dem==2)
    {
        return 1;
    }else
        return 0;
}
    public static int find(int a[],int k)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
    public static void square(int a[])
    {
        int [] b = new int[a.length];
        for (int i=0;i<a.length;i++)
        {
            b[i] = a[i]*a[i];
        }
        for (int i=0;i<b.length;i++)
        {
            System.out.printf("%d ",b[i]);
        }
        

    }
    public static void main( String[] args)
    {
        int count=0;
        int [] a = {1,2,7,5,9,4,11};
        
        for(int i:a)
        {
            if(snt(i)==1)
            {
                count++;
            }
        }
        System.out.println("Count prime number="+count);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter k= ");
        int k= sc.nextInt();
        System.out.printf("Index of an element %d is %d\n",k,find(a,k));
        System.out.println("Square element is ");
        square(a);
    }
    
}

    

