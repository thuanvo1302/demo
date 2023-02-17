import java.util.NoSuchElementException;

public class MyLinkedList <E> implements ListInterface<E>{
    private Node<E> head = null;
    private int numNode = 0;
    public MyLinkedList(){
        head = null;
        numNode = 0;
    }
    public void print(){
        Node<E> temp = head;
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
    public void addFirst(E item){
        head = new Node<E>(item, head);
        numNode++;
    }
    public void addAfter(Node<E> curr, E item){
        if(curr == null){
            throw new NoSuchElementException("This element isn't exists");
        }
        else{
            Node<E> temp = new Node<E>(item);
            temp.setNext(curr.getNext());
            curr.setNext(temp);
            numNode++;
        }
    }
    public void addLast(E item){
        if(head == null){
            Node <E> temp = new Node<E> (item);
            head = temp;
        }
        else{
            Node<E> temp = head;
            Node<E> add = new Node<E> (item);
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
    public E removeFirst(){
        if(head == null){
            throw new NoSuchElementException("Can't remove first element");
        }
        else{
            Node<E> temp = head;
            head = head.getNext();
            numNode--;
            return temp.getData();
        }
    }
    public E removeAfter(Node<E> curr){
        if(head == null || head.getNext() == null){
            throw new NoSuchElementException("Can't remove this Node");
        }
        else{
            Node<E> temp = curr.getNext();
            curr.setNext(temp.getNext());
            numNode--;
            return temp.getData();
        }
    }
    public E removeLast(){
        if(head == null){
            throw new NoSuchElementException("NO element");
        }
        else{
            Node<E>  temp = head;
            E tam = temp.getData();
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
    public Node<E> getHead(){
        return head;
    }
    public E getFirst(){return head.getData();}
    public boolean contains(E items){
        Node<E> temp = head;
        for(int i = 0; i < numNode; i++){
            if(temp.getData().equals(items)){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
}
