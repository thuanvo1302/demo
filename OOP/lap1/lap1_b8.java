package lap1;
import java.util.Scanner;

public class lap1_b8 {
public static int caua(int a)
{
    int s=0;
    for(int i=1;i<=a;i++)
    {
        s+=i;
    }
    return s;
    
}
public static int caub(int a)
{
    int s=1;
    for(int i=1;i<=a;i++)
    {
        s*=i;
    }
    return s;
    
}
public static int cauc(int a)
{
    int s=0;
    for(int i=1;i<=a;i++)
    {
        s=(int) (s+1+ Math.pow(2,i));
    }
    return s;
    
}
public static double caud(int a)
{
    double s=0;
    for(int i=1;i<=a;i++)
    {
        s+=1.0/(2*i);
    }
    return (double) s;
    
}
public static long caue(int a)
{
    long s=0;
    for(int i=1;i<=a;i++)
    {
        s+=Math.pow(i,2);
    }
    return s;
    
}
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Input n= ");
        int n = sc.nextInt();
        System.out.println("S= "+caua(n));
        System.out.println("P= "+caub(n));
        System.out.println("S= "+cauc(n));
        System.out.printf("S= %.2f\n",caud(n));
        System.out.println("S= "+caue(n));

    }
}
