public class test {
    //EX8
    public static int countEvenLL(Node<Integer>head) {
        int count = 1;
        if(head == null) return 0;
        else if((Integer)head.getData()%2==0){
            count = 0;
        }
        return count + countEvenLL(head.getNext());
    }

    public static int sumNumLL(Node<Integer>head) {
        if(head == null) return 0;
        return head.getData() + sumNumLL(head.getNext());
    }

    public static void main(String[] args) {
        MyLinkedList <Integer> myList = new MyLinkedList<>();
        myList.addFirst(1);
        myList.addFirst(2);
        myList.addFirst(3);
        myList.addFirst(4);
        myList.addFirst(5);
        myList.addFirst(6);
        myList.print();
        myList.addSortedList(4);
        myList.print();

        System.out.println("even: "+countEvenLL(myList.getHead()));
        System.out.println("sum: "+sumNumLL(myList.getHead()));
    }

}
