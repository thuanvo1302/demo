public class Test {
    public static void main(String[] args) {
        MyLinkedList <Integer> list = new MyLinkedList <Integer>();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(1);
        list.addFirst(4);
        list.addFirst(0);
        list.print();
        list.addAfter(list.getHead().getNext(), 10);
        list.removeLast();
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
        System.out.println(list.getHead().getData());
        list.removeAfter(list.getHead());
        list.print();
        System.out.println(list.size());
        list.removeLast();
        list.print();
    }
}
