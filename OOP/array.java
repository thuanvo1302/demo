public class array {
    public static int [] reverse(int[] list){
        int[] result = new int[list.length];
        for( int i=0, j= result.length-1;i<list.length;i++,j--){
            result[j] = list[i];
        }
        return result;
    }
    
}
