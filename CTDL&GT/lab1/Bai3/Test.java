import java.util.NoSuchElementException;

public class Test {
    public static int countEven(MyLinkedList<Integer> A){
        int total = 0;
        Node<Integer> temp = A.getHead();
        for(int i = 0; i < A.size(); i++){
            if(temp.getData() % 2== 0){
                total++;
            }
            temp = temp.getNext();
        }
        return total;
    }
    public static int countPrime(MyLinkedList<Integer> A){
        int total = 0;
        Node<Integer> temp = A.getHead();
        for(int i = 0; i < A.size(); i++){
            for(int j = 2; j < temp.getData() -1; j++){
                if(temp.getData() %  j == 0){
                    total++;
                    break;
                }
            }
            temp = temp.getNext();
        }
        return A.size() - total;
    }
    public static int addEven(MyLinkedList<Integer> A, int item){
        Node<Integer> temp = A.getHead();
        if(temp == null){
            throw new NoSuchElementException("No element to add");
        }
        else if(A.size() == 1 || temp.getData() % 2 == 0){
            A.addFirst(item);
        }
        else{
            for(int i = 0; i < A.size(); i++){
                if(temp.getNext() == null){
                    throw new NoSuchElementException("No even number in this list");
                }
                else if(temp.getNext().getData() % 2 == 0){
                    A.addAfter(temp, item);
                    return item;
                }
                temp = temp.getNext();
            }
            throw new NoSuchElementException("NO even number in this list");
        }
        return item;
    }
    public static int findMax(MyLinkedList<Integer> A){
        if(A.size() == 0){
            throw new NoSuchElementException("No ELement");
        }
        else{
            int max = A.getFirst();
            Node<Integer> temp = A.getHead();
            for(int i = 0; i < A.size(); i++){
                temp = temp.getNext();
                if(temp != null && temp.getData() > max){
                    max = temp.getData();
                }
            }
            return max;
        }
    }
    public static void reverse(MyLinkedList<Integer> A){
        if(A.size() == 0){
            throw new NoSuchElementException("No Element");
        }
        else{
            Node<Integer> temp = A.getHead();
            Node<Integer> tam = new Node<>();
            int total = A.size();
            while(total - 1 != 0){
                // while()
            }
        }
    }
    public static void main(String[] args){
        MyLinkedList<Integer> A = new MyLinkedList<Integer>();
        A.addFirst(5);
        A.addLast(9);
        A.addLast(4);
        A.addFirst(3);
        //A.removeFirst();
        A.print();
        // System.out.println("\n"+A.removeLast());
        // System.out.println(A.contains(5));
        System.out.println("\nMax in list: "+ findMax(A));
        addEven(A, 3);
        A.print();
    }
}
