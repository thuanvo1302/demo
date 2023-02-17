public class Test {
    public static void main(String[] args){
        MyLinkedList<Integer> A = new MyLinkedList<Integer>();
        A.addFirst(5);
        A.addLast(9);
        A.addLast(5);
        A.addFirst(9);
        //A.removeFirst();
        A.print();
        System.out.println("\n"+A.removeLast());
        // System.out.println(A.contains(5));
        A.print();
        Node<Integer> temp = A.getHead();
        for(int i = 0; i < 2; i++){
            temp = temp.getNext();
        }
        System.out.println(A.removeCurr(temp));
        A.print();
    }
}
