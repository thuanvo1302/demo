import java.util.*;
public interface ListInterface <E>{
    public void addFirst (E item);
    // public void addAfter (int position, E item);
    public E addAfter (Node <E> curr, E item) throws NoSuchElementException;

    public void addLast (E item);
    
    public  E removeFirst () throws NoSuchElementException;
    // public  void removeAfter (int position) throws NoSuchElementException;
    public  E removeLast () throws NoSuchElementException;
    public E removeCurr(Node <E> curr) throws NoSuchElementException;

    public  Node <E> getNodeElement(int index) throws NoSuchElementException;
    public void print();
    public boolean isEmpty();
    public E getFirst() throws NoSuchElementException;
    //node gom data va con tro => muon tra ve ca nuoc lan cai thi xai node con muon tra cai khac nhu int thi sd E
    public Node <E> getHead(); 
    public int size();
    public boolean contains(E item);
}

