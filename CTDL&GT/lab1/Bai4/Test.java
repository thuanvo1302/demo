public class Test {
    public static void main(String[] args){
        MyDoubleLinkedList A = new MyDoubleLinkedList();
        A.addFirst((double) 5);
        A.addLast((double)9);
        A.addLast((double)5);
        A.addFirst((double)9);
        //A.removeFirst();
        A.print();
        System.out.println("\n"+A.removeLast());
        System.out.println(A.contains((double)5));
        
        A.print();
    }
}
