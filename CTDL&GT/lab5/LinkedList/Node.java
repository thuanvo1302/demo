
public class Node {
    private int data;
    private Node next;
    public Node(){};
    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
    public int getData(){
        return this.data;
    }
    public void setNext(Node node){
        this.next=node;
    }
    public Node getNext(){
        return this.next;
    }
}
