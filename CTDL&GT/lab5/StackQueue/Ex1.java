import java.util.Stack;

public class Ex1{
    public static boolean isNumber(String str){
        return str.matches("(0|[1-9][0-9]*)");
    }
    public static int CalculatePostfix(String str){
        Stack<Integer> stack= new Stack<Integer>();
        String[] str_ch= str.split(" ");
        for(String i : str_ch){
            if(isNumber(i)){
                stack.push(Integer.parseInt(i));
            }else{
                Integer a1= stack.pop();
                Integer a2= stack.pop();
                Integer res=0;
                if(i.equals("+")){
                    res=a2+a1;
                }
                if(i.equals("-")){
                    res=a2-a1;
                }
                if(i.equals("*")){
                    res=a2*a1;
                }
                if(i.equals("/")){
                    res=a2/a1;
                }
                stack.push(res);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args){
        String str="34 25 *";
        System.out.println(CalculatePostfix(str));
        // String[] str_ch=str.split(" ");
        // for(String i : str_ch){
        //     System.out.println(i);
        // }
    }
}