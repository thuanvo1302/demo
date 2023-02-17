import java.util.NoSuchElementException;
public interface ListInterface <E>{
    
    public void addFirst(E item);
    //them vao sau phan tu
    public void addAfter(Node <E> curr, E item);
    // them phan tu vao cuoi
    public void addLast(E item);

    //NosuchElementException: truy cap 1 phan tu ko co san tren trang
    public E removeFirst () throws NoSuchElementException;
    //remove phan tu sau 1 thanh phan nhat dinh
    public E removeAfter (Node <E> curr) throws NoSuchElementException;
    public E removeLast () throws NoSuchElementException;

    public void print();
    public boolean isEmpty();
    public E getFirst () throws NoSuchElementException;
    public Node <E> getHead ();
    public int size ();
    public boolean contains (E item);
}
