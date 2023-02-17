package lap2;

public class b2 {
    public static int findMin(int arr[])
    {
        int min=arr[0];
        for(int i:arr)
        {
            
            if(i<min)
            {
                min=i;
            }
        }
        return min;
    }
    public static void main(String[] agrs)
    {
        int [] arr= {3,1,5,7,8};
        System.out.println("Min: "+findMin(arr));
    }
}
