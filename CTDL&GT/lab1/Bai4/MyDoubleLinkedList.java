import java.util.*;

public class MyDoubleLinkedList implements ListInterface{
    private Node<Double> head = null;
    private int numNode = 0;
    public MyDoubleLinkedList(){
        head = null;
        numNode = 0;
    }
    public void print(){
        Node<Double> temp = head;
        if(head == null){
            System.out.println("NO element");
        }
        else{
            System.out.print("List is:");
            for(int i = 0; i<numNode; i++){
                System.out.print(" "+temp.getData());
                temp = temp.getNext();
            }
        }
        /*
         * while(temp.getNExt() != null){
         * System.out.print(" "+temp.getData());
            temp = temp.getNext();
         * }
         */
    }
    @Override
    public void addFirst(Double item){
        head = new Node<Double>(item, head);
        numNode++;
    }
    public void addAfter(Node<Double> curr, Double item){
        if(curr == null){
            throw new NoSuchElementException("This element isn't exists");
        }
        else{
            Node<Double> temp = new Node<Double>(item);
            temp.setNext(curr.getNext());
            curr.setNext(temp);
            numNode++;
        }
    }
    public void addLast(Double item){
        if(head == null){
            Node <Double> temp = new Node<Double> (item);
            head = temp;
        }
        else{
            Node<Double> temp = head;
            Node<Double> add = new Node<Double> (item);
            for(int i = 0; i< numNode; i++){
                if(temp.getNext() == null){
                    temp.setNext(add);
                    numNode++;
                    break;
                }
                temp = temp.getNext();
            }
        }
    }
    public Double removeFirst(){
        if(head == null){
            throw new NoSuchElementException("Can't remove first element");
        }
        else{
            Node<Double> temp = head;
            head = head.getNext();
            numNode--;
            return temp.getData();
        }
    }
    public Double removeAfter(Node<Double> curr){
        if(head == null || head.getNext() == null){
            throw new NoSuchElementException("Can't remove this Node");
        }
        else{
            Node<Double> temp = curr.getNext();
            curr.setNext(temp.getNext());
            numNode--;
            return temp.getData();
        }
    }
    public Double removeLast(){
        if(head == null){
            throw new NoSuchElementException("NO element");
        }
        else{
            Node<Double>  temp = head;
            Double tam = temp.getData();
            for(int i = 0; i < numNode;i++){
                if(temp.getNext()==null){
                    tam = temp.getData();
                    temp = null;
                    numNode--;
                    break;
                }
                temp = temp.getNext();
            }
            return tam;
        }
    }
    public int size(){return numNode;}
    public boolean isEmpty(){
        if(numNode == 0){
            return true;
        }
        return false;
    }
    public Node<Double> getHead(){
        return head;
    }
    public Double getFirst(){return head.getData();}
    public boolean contains(Double items){
        Node<Double> temp = head;
        for(int i = 0; i < numNode; i++){
            if(temp.getData().equals(items)){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
}
