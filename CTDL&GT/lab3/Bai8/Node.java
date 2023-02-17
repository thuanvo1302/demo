public class Node <E>{
    private E data;
    private Node<E> next;
    public Node(){
        this.data = null;
        this.next = null;
    }

    public Node(E data, Node<E> next){
        this.data = data;
        this.next = next;
    }

    public Node (E data){
        this(data,null);
    }

    public Node<E> getNext(){
        return this.next;
    }

    public E getData(){
        return this.data;
    }

    public void setNext(Node<E>n) {
        this.next = n;
    }
}
