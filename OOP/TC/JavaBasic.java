package TC;



public class JavaBasic {
        public static int sumNegativeElements(int a[]){
            int s=0;
            for(int i=0;i<a.length;i++)
            {
                s+=a[i];
            }
            return s;
        }
    
        public static String uppercaseFirstVowels(String str){
            // str=str.trim();
            // if(str.charAt(0) == 'u' || str.charAt(0) == 'o' ||str.charAt(0) == 'a' ||str.charAt(0) == 'e' ||str.charAt(0) == 'i' )
            // {
            //     String s = str.substring(0,1);
            //     s.toUpperCase();
            //     String str1=s.concat(str.substring(1,str.length()));
            // }
            // for(int i=0;i<str.length();i++)
            // {
               
            // }
            
                    String[] words = str.split(" ");
                    System.out.println(words[0].charAt(1));
                    for (int i = 0; i < words.length; i++) {
                        switch (words[i].charAt(0)) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                words[i] = words[i].substring(0, 1).toUpperCase() +
                                             words[i].substring(1);
                                break;
                            default:
                                break;
                        }
                    }
                    String result = "";
                    for (String w: words) {
                        result += w + " ";
                    }
                    return result;
                }
                
            
            
        

        public static int findMinNegativeElement(int a[]){
            //sinh vien code tai day
            
        }
        
        public static String getName(String str){
            //sinh vien code tai day
        }
    
        public static int findFirstMod3Element(int[] a){
            //sinh vien code tai daye
        }
    
        public static int countString(String str, String k){
            //sinh vien code tai day
        }
    
        public static void main(String[] args){
            int[] a = {1,-2,3,4,-2,1,-9};
            //sinh vien code tai day
            String str = "nguyen thi uyen an";
            //sinh vien code tai day
            String s1 = "Ho ten: Nguyen Thi Anh Dao";
            //sinh vien code tai day
            String s2 = "Nguyen Phuong Hoang Anh Phuong Oanh";
            //sinh vien code tai day
            System.out.println(uppercaseFirstVowels(str));
    
    }
    
}
