import java.util.NoSuchElementException;

public interface LinkedListCustomInterface<E> {

    public void add(E item);

    public E remove() throws NoSuchElementException;

    public void print();

    public boolean isEmpty();

    public E getFirst() throws NoSuchElementException;

    public int size();

    public boolean contains(E item);
}
