import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Ex2{
    public static void readstack(Stack<Integer> stack, int n){
        while(n!=0){
            stack.push(n%10);
            n/=10;
        }
    }
    public static void readqueue(Queue<Integer> queue, int n){
        while(n!=0){
            queue.offer(n%10);
            n/=10;
        }
    }
    public static void printll(Queue<Integer> queue){
        if(queue !=null){
            System.out.println(queue.peek());
        }
        queue.poll();
        printll(queue);
    }
    public static boolean compare(Stack<Integer> stack, Queue<Integer> queue){
        if(stack.pop()==queue.poll()) return true;
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n=");
        int n=sc.nextInt();
        sc.close();
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        readstack(stack, n);
        readqueue(queue, n);
        System.out.println(stack);
        System.out.println(queue);
        System.out.println(compare(stack, queue));
        // printll(queue);
    }
}