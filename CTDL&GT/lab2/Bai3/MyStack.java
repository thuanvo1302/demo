import java.util.NoSuchElementException;

public class MyStack <E> implements StackInterface<E>{
    private Node<E> top;
    private int numNode;
    public MyStack(){
        this.top= null;
        this.numNode=0;
    }
    @Override
    public void push(E item){
        this.top=new Node<E>(item,top);
        this.numNode++;
        return ;
    }
    public E pop(){
        if(top==null){
            throw new NoSuchElementException("Can't get element from Stack");
        }else{
            Node <E> tmp=top;
            
            top=top.getNext();
            
            numNode--;
            return tmp.getData();

        }
    }
    public int size(){
        return numNode;
    }
    public boolean contains(E item){
        return true;
    }
    @Override
    public void print(){
        if(top!=null){
            Node<E> tmp = top;
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
    public boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }
    public E getPeek(){
        return null;
    }
    public E getTop(){
        return top.getData();
    }
    
}
