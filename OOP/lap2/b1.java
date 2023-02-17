package lap2;

public class b1
{
    public static int findMax(int arr[])
    {
        int m=arr[0];
        for(int i:arr)
        {
            if(i>m)
            {
                m=i;
            }
        }
        return m ;
    }
    public static void main(String[] args)
    {
        int [] arr= {1,4,2,5,7};
        System.out.println("Max: "+findMax(arr));
    }
}
