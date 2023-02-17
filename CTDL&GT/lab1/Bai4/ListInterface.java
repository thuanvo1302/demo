public interface ListInterface{
    public void addFirst(Double item);
    public void addAfter(Node <Double> curr, Double item);
    public void addLast(Double item);
    public Double removeFirst();
    public Double removeAfter(Node<Double> curr);
    public Double removeLast();
    public int size();
    public boolean contains(Double item);
    public void print();
    public boolean isEmpty();
    public Node<Double>  getHead();
    public Double getFirst();
}
