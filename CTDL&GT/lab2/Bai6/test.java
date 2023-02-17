import java.util.NoSuchElementException;
import java.util.Scanner;

public class test {
    public static void readstack(MyStack<String> stack,String str){
        for(int i=0;i<str.length()/2;i++){
                stack.push(str.substring(i, i+1).toLowerCase());
            
        }
    }
    public static void readqueue(MyQueue<String> queue,String str){
        for(int i=str.length()/2;i<str.length();i++){
                queue.enQueue(str.substring(i, i+1).toLowerCase());
        }
    }
    public static void compare(MyStack<String> stack,MyQueue<String> queue, String str){
        String str1="";
        if(stack.getTop()==null&& queue.getFront()==null){
            throw new NoSuchElementException("Can't");
        }else if(stack.getTop()== null || queue.getFront()==null){
            System.out.println("Don't same");
        }else{
            while(stack.getTop()!=null && queue.getFront()!= null){
                if(stack.getPeek().equals(queue.getFront())){
                    str1="same";
                }
                else{
                    str1="Dpn't same";
                    break;
                }
                stack.pop();
                queue.deQueue();
            }
            // if(stack.getTop()== null || queue.getFront()==null)
            // {
            //     str1="Don't same";
            // }
        }
        System.out.println(str1);
    }
    
    public static void main(String[] args){
        MyStack <String> stack= new MyStack<String>();
        MyQueue<String> queue= new MyQueue<String>();
        // queue.enQueue("mot");
        // queue.enQueue("hai");
        // queue.enQueue("ba");
        // queue.enQueue("bon");
        // queue.print();
        // System.out.println(queue.deQueue());
        // queue.print();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str=sc.nextLine();
        sc.close();
        str=str.replace(" ","");
        System.out.println(str);
        readstack(stack, str);
        readqueue(queue, str);
        stack.print();
        queue.print();
        compare(stack, queue, str);
    }
}
