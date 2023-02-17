package lap5;

import java.util.Arrays;

public class string2 {
    public static int countWord(String paragraph)
    {
        int count=0;
        for(int i=0;i<paragraph.length();i++)
        {
            count++;
        }
        return count;
    }
    public static int countSentences(String paragraph)
    {
        int count=0;
        for(int i=0;i<paragraph.length();i++)
        {
            if(paragraph.charAt(i)=='.')
            {
                count++;
            }
        }
        return count;
    }
    public static int countAppear(String paragraph, String word)
    {
        String[] str1 = paragraph.split(" ");
        int count=0;
        for(String x: str1)
        {
            if(word.equals(x))
            {
                count++;
            }
        }
        return count;
    }
    public static void main( String args[])
    {
        String paragraph ="vo minh thuan mot hai ba thuan";
        String word ="thuan";
        System.out.println(countWord(paragraph));
        System.out.println(countSentences(paragraph));
        System.out.println(countAppear(paragraph, word));
        
    }
}

