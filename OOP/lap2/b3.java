package lap2;

public class b3 {
    public static int findMin(int arr[])
    {
        int s=0;
        for(int i:arr)
        {
            
            if(i%2==0)
            {
                s+=i;
            }
        }
        return s;
    }
    public static void main(String[] agrs)
    {
        int [] arr= {3,1,4,7,8};
        System.out.println("Min: "+findMin(arr));
    }
}