import java.util.NoSuchElementException;
import java.util.Scanner;


public class test {
    public static void readin(MyStack<String> a, String str){
            for(int i=0;i<str.length();i++){
                if(str.substring(i, i+1).equals("(")|| str.substring(i, i+1).equals("[")||str.substring(i, i+1).equals("{") ){
                    a.push(str.substring(i, i+1));
                }
            }
    }
    public static void readout(MyStack<String> b, String str){
        for(int i=str.length();i>str.length()/2;i--){
            if(str.substring(i-1, i).equals(")")|| str.substring(i-1, i).equals("]")||str.substring(i-1, i).equals("}") ){
                b.push(str.substring(i-1, i));
            }
        }
    }
    public static int against(String a, String b){
        if(a.equals("(")&& b.equals(")")||(a.equals("[")&& b.equals("]")||(a.equals("{")&& b.equals("}")))){
            return 1;
        }else return 0;
    }
    public static void compare(MyStack<String> a,MyStack<String> b, String str){
        String str1="";
        if(a.getTop()==null&& b.getTop()==null){
            throw new NoSuchElementException("Can't");
        }else if(a.getTop()== null || b.getTop()==null){
            System.out.println("Don't same");
        }else{
            while(a.getTop()!=null && b.getTop()!= null){
                if(against(a.getPeek(), b.getPeek())==1){
                    str1="same";
                }
                else{
                    str1="Dpn't same";
                    break;
                }
                a.pop();
                b.pop();
            }
            if(a.getTop()== null || b.getTop()==null)
            {
                str1="Don't same";
            }
        }
        System.out.println(str1);
    }
        
    
    public static void main(String[] args){
        MyStack<String> a = new MyStack<String>();
        MyStack<String> b = new MyStack<String>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str= sc.nextLine();
        sc.close();
        readin(a, str);
        a.print();
        
        readout(b, str);
        
        b.print();
        compare(a,b, str);
        
        
        }
    }

