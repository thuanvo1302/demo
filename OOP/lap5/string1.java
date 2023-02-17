package lap5;

public class string1 {
    public static String shortName(String str)
    {
        String str1="";
        String[] name = str.split(" ");
        for(String x: name)
        {
            str1=x;
            str1=str1+" ";
        }
        for(String x: name)
        {
            str1=str1+x;
            break;
        }
        return str1;
    }
    public static String hashtagName(String str)
    {
        String str1= shortName(str);
        str1="#"+str1;
        return str1;
    }
    public static String upperCaseAllVowel(String str)
    {
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == 'u' || str.charAt(i) == 'i' || str.charAt(i) == 'e' || str.charAt(i) == 'a' || str.charAt(i) == 'o' )
            {
                String s= str.substring(i,i+1);
                str1+=s.toUpperCase();
            }
            else {
                String s2= str.substring(i,i+1);
                str1+=s2.toLowerCase();
            }
        }
        String[] str2 = str1.split(" ");
        String str3="";
        for(String x: str2)
        {
            
                str3= str3 + (x.substring(0,1).toUpperCase()+x.substring(1));
                str3= str3 + " ";
        }
        return str3;
    }
    public static void main( String[] args)
    {
        String str = "Nguyen Le Trong Tin";
        System.out.println(shortName(str));
        System.out.println(hashtagName(str));
        System.out.println(upperCaseAllVowel(str));

    }
}
