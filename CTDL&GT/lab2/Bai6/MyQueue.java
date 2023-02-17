import java.util.NoSuchElementException;

public class MyQueue<E> extends MyLinkedList<E> implements QueueInterface<E>{
    private Node<E> front;
    private Node<E> rear;
    private int numNode;
    public MyQueue(){
    }
    @Override
    public void enQueue(E item){
        Node<E> node = new Node<E> (item);
            if (isEmpty())
                front = node;
            else
                rear.setNext (node);

            rear = node;
            numNode++;
    }
    
    @Override
    public E deQueue(){
        if(front==null){
            throw new NoSuchElementException("Can't get element from Queue");
        }else{
            Node<E> tmp=front;
            front=front.getNext();
            numNode--;
            return tmp.getData();
        }
        // E data = front.getData();
        // front = front.getNext();
        // if(isEmpty()){
        //     rear=null;
        // }
        // numNode--;
        // System.out.println(data+" remobe from the queue");
        // return data;
    }
    @Override
    public int size(){
        return numNode;
    }
    @Override
    public boolean contains(E item){
        return false;
    }
    @Override
    public void print(){
        if(front!=null){
            Node<E> tmp = front;
            System.out.print("List "+tmp.getData());
            tmp.getNext();
            while(tmp.getNext()!=null){
                System.out.print("->"+tmp.getNext().getData());
                tmp=tmp.getNext();
            }
            System.out.println();
            
        }else{
            System.out.println("List is empty");
        }
    }
    @Override
    public boolean isEmpty(){
        if(front==null){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public E getFront(){
        return front.getData();
    }
    
}
    