public class Test {
    public static void main(String args[]){
        CharLinkedList char1= new CharLinkedList();
        char1.addFirst('c');
        char1.addFirst('b');
        char1.addFirst('A');
        char1.print();
        System.out.println(char1.getHead());
        char1.addAfterFirstKey('E', 'b');
        char1.print();
        System.out.println(char1.largestCharPostition());
        // char char2='a';
        // char char3='b';
        // System.out.println((int)char2);
    }
}
