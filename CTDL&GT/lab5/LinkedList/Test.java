public class Test {
    public static void main(String[] args){
        IntLinkedList ll= new IntLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(5);
        ll.addLast(3);
        ll.print();
        // ll.removeAt(3);
        ll.print();
        System.out.println(ll.countOdd());
        System.out.println(ll.searchKey(1));
        System.out.println(ll.checkSorted());
    }
}
