import java.util.Stack;

public class Cau3 {
    public static int calculate(String[] expression) {
        // code here
        Stack<Integer> a= new Stack<Integer>();
        for(String n : expression){
            if(isNumber(n)){
                a.push(Integer.parseInt(n));
            }else{
                Integer b1=a.pop();
                Integer b2=a.pop();
                Integer res=0;
                if(n.equals("+")){
                    res=b1+b2;
                }
                if(n.equals("-")){
                    res=b2-b1;
                }
                a.push(res);
            }
        }
        return a.pop();
    }
    public static boolean isNumber(String str){
        return str.matches("(0|[1-9][0-9]*)");
    }
    public static void main(String args[]){
        
		    System.out.println(calculate(new String[]{"7625", "32897", "-"}));

	}
}