import java.util.Scanner;

public class b3 {
    public static void b34(String n)
    {
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i) == 'u' || n.charAt(i) == 'i' || n.charAt(i) == 'e' || n.charAt(i) == 'a' || n.charAt(i) == 'o' )
            {
                String s= n.substring(i,i+1);
                System.out.print(s.toUpperCase());
            }
            else {
                String s2= n.substring(i,i+1);
                System.out.print(s2.toLowerCase());
            }
        }
    } 
    public static int b42(String n)
    {
        int count=1;
        char a[] = new char[n.length()];
        for(int i=0;i<n.length();i++)
        {
            a[i]=n.charAt(i);
            if(((i>0)&&(a[i] != ' '))  && (a[i-1] == ' ')  )
            {
                count++;
            }
        }
        return count;
    }  
    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        b34(n);
        System.out.println();
        System.out.println("length of string: "+n.length());
        System.out.println("Count number of words in string is "+b42(n));

    }
    
}
