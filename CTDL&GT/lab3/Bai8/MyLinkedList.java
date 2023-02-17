import java.util.NoSuchElementException;
public class MyLinkedList <E> implements ListInterface <E>{
    private Node<E> head;
    private int numNode;
    
    public MyLinkedList(){
        this.head = null;
        this.numNode = 0;
    }

    @Override
    public void addFirst(E item) {
        head = new Node<E>(item,head);
        numNode++;
    }

    @Override
    public E addAfter(Node<E> curr, E item) throws NoSuchElementException {
        if(head == null){
            throw new NoSuchElementException("Empty list");
        }else if(curr==null){
            throw new NoSuchElementException("Doesn't exist");
        }else{
            Node<E> newNode = new Node<>(item);
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
            numNode++;
            return newNode.getData();
        }
    }

    @Override
    public void addLast(E item) {
        if(head==null){
            addFirst(item);
        }else{
            Node<E> tmp = head;
            Node<E> newNode = new Node<>(item);
            while(tmp.getNext()!= null){
                tmp = tmp.getNext();
            }   
            tmp.setNext(newNode);
            numNode++;
        }
        
    }

    @Override
    public E removeFirst() throws NoSuchElementException {
        if(head==null){
            throw new NoSuchElementException("Empty list");
        }else{
            head = head.getNext();
            numNode--;
        }
        return null;
    }

    @Override
    public E removeLast() throws NoSuchElementException {
        if(head==null){
            throw new NoSuchElementException("Empty list");
        }else{
            Node<E> delNode = head;
            Node<E> preNode = null;
            while(delNode.getNext()!=null){
                preNode = delNode;
                delNode = delNode.getNext();
            }
            preNode.setNext(null);
            numNode--;
        }
        return null;
    }

    @Override
    public E removeCurr(Node<E> curr) throws NoSuchElementException {
        if(head==null){
            throw new NoSuchElementException("Empty list");
        }else if(curr==null){
            throw new NoSuchElementException("There is no curr node");
        }
        else{
            Node<E> tmp = head;
            while(tmp.getNext()!=curr){
                tmp = tmp.getNext();
            }
            tmp.setNext(curr.getNext());
            numNode--;
        }
        return null;
    }

    @Override
    public Node<E> getNodeElement(int index) throws NoSuchElementException {
        if(head==null){
            throw new NoSuchElementException("Empty list");
        }else{    
            int count = 0;
            Node<E> tmp = head;
            while(tmp!=null){
                if(count == index){
                    return tmp;
                }
                count++;
                tmp = tmp.getNext();
            }
        }
        throw new NoSuchElementException("There is no such position");
    }

    @Override
    public void print() {
       if(head==null){
        System.out.println("Empty list");
       }else{
            Node<E> tmp = head;
            System.out.print("List: "+tmp.getData());
            tmp = tmp.getNext();
            while(tmp!=null){
                System.out.print(" => "+tmp.getData());
                tmp = tmp.getNext();
            }            
            System.out.println();
       } 
    }

    @Override
    public boolean isEmpty() {
        if(numNode==0) return true;
        return false;
    }

    @Override
    public E getFirst() throws NoSuchElementException {
        return head.getData();
    }

    @Override
    public Node<E> getHead() {
        return head;
    }

    @Override
    public int size() {
        return numNode;
    }

    @Override
    public boolean contains(E item) {
        Node <E> tmp = head;
        while (tmp!=null){
            if(tmp.getData().equals(item)){
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    public E addSortedList(E item) throws NoSuchElementException{
        if(head==null){
            throw new NoSuchElementException("Empty list");
        }else{
            Node<E> newNode = new Node<>(item);
            Node<E> tmp = head;
            while(tmp!=null){
                if(tmp.getData() instanceof Integer && (Integer)tmp.getData()>(Integer)item){
                    return addAfter(tmp, item);
                }
                tmp = tmp.getNext();
            }
        }
        throw new NoSuchElementException("There is no bigger than "+item);
    }
}
