public class Node <E> {
    private E data;
    private Node <E> next;
    
    //constructor
    public Node() {
       data=null;
       next=null; 
    }

    public Node (E data, Node <E> next){
        this.data = data;
        this.next = next;
    }

    public Node(E data){
        this(data, null);
    }

    //lay phan tu tiep theo
    public Node <E> getNext(){
        return next;
    }

    //lay du lieu trong phan tu
    public E getData(){
        return data;
    }

    //thay doi con tro
    public void setNext (Node <E> n){
        next = n;
    }
}

