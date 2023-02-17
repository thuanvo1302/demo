package lap5;

public class array {
    public static int max(int[] a)
    {
        int max=0;
        for(int x: a)
        {
            if(x>max)
            {
                max=x;
            }
        }
        return max;
    }
    public static int maxEven(int[] a)
    {
        int max=0;
        for(int x: a)
        {
            if(x%2==0 && x>max )
            {
                max=x;
            }
        }
        return max;
    }
    public static int minOdd(int[] a)
    {
        int min=max(a);
        for(int x: a)
        {
            if(x%2!=0 && x<min )
            {
                min=x;
            }
        }
        return min;
    }
    public static int sumMEMO(int[] a)
    {
        int sum=0;
        sum=maxEven(a)+minOdd(a);
        return sum;
    }
    public static int sumEven(int[] a)
    {
        int sum=0;
        for(int x: a)
        {
            if(x%2==0 )
            {
                sum+=x;
            }
        }
        return sum;
    }
      
    public static void main( String args[])
    {
        int [] a={4,7,3,8,5,1,6,7};
        System.out.println("maxEven "+maxEven(a));
        System.out.println("minOdd "+minOdd(a));
        System.out.println("sumMEMO "+sumMEMO(a));
        System.out.println("sumEven "+sumEven(a));
    }
}
