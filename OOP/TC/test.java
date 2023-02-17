package TC;

public class test {
    private static final String String = null;
    public static String nn(String s)
    {
        return s;
    }
    public static void main(String args[])
    {
        String str = "vo minh thuan";
        String [] str1 = str.split(" ");
        String str2="";
        
        for(String x: str1)
        {
            
                str2= str2 + (x.substring(0,1).toUpperCase()+x.substring(1));
                str2= str2 + " ";
        }
        System.out.println("chuoi sau "+str2);
        int count =0;
        for(String x:str1)
        {
            // System.out.println(x);
            count++;
        }
        System.out.println(count);
    }
}
