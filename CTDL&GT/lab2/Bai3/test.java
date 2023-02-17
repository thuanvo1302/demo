import java.util.Scanner;


public class test {
    
    public static void main(String[] args){
        MyStack a = new MyStack<String>();
        // a.push(new Integer(5));
        // a.push(new Integer(6));
        // a.push(new Integer(7));
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str= sc.nextLine();
        for(int i=0;i<str.length();i++){
            a.push(str.substring(i, i+1));
        }
        a.print();
        }
    }

