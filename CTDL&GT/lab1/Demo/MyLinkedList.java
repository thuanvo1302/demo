import java.util.NoSuchElementException;
//ket noi cac node lai thanh 1 danh sach
//phai co E o hai cho
public class MyLinkedList <E> implements ListInterface <E>{
    private Node <E> head;
    //so luong node trong list
    private int numNode;
    
    //khoi tao 1 list trong
    public MyLinkedList(){
        this.head = null;
        //lay thuoc tinh trong chinh class cap nhat len 1
        this.numNode=0;
    }

    @Override
    public void addFirst(E item) {
        // them phan tu vao dau va cap nhat no la head
        this.head = new Node<>(item,head);
        this.numNode++;
        
    }

    @Override
    public void addAfter(Node<E> curr, E item) {
        //neu nhu no chua co node nao thi day se la node dau tien
        if (curr == null){
            addFirst(item);
        }else{
            //tao node moi gia tri can khoi tao con tro chi vao thang nam sau node curr
            Node <E> newNode = new Node <E> (item, curr.getNext());
            //con nut curr se tro con tro toi thang moi
            curr.setNext(newNode);
        }
        numNode++;
    }

    @Override
    public void addLast(E item) {
        //neu danh sach ko ton tai thi thang dau la thang cuoi
        if (head == null){
            addFirst(item);
        }else{
            Node <E> tmp = head;
            //cai tip theo tro vao null => last
            while (tmp.getNext() !=null){
                //neu ko thi tiep tuc di chuyen
                tmp = tmp.getNext();
            }
            // tao 1 node moi, con tro chi vao null
            Node<E> newNode = new Node<E> (item, null);
            // con tro cua current chi vao node moi
            tmp.setNext(newNode);
            numNode++;
        }
    }

    @Override
    public E removeFirst() throws NoSuchElementException {
        //ds ko co j het
        if(head ==null){
            throw new NoSuchElementException("Can't remove elemnet from empty list");
        }else{
            Node <E> tmp = head;
            //trro con tro toi thang sau no => da xoa thang dau
            head = head.getNext();
            numNode--;
            return tmp.getData();
        }
    }

    @Override
    public E removeAfter(Node<E> curr) throws NoSuchElementException {
        //list rong ko co bat ky phan tu nao de xoa
        if(curr == null){
            throw new NoSuchElementException("Can't remove elements from an empty list");
        }else{
            //nut can xoa se nam sau nut curr 
            Node <E> delNode = curr.getNext();
            if(delNode!=null){
                curr.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            }else{
                //neu nhu node hien tai la nut cuoi cung thi ko co j phia sau de xoa
                throw new NoSuchElementException("No next node to remove");
            }
        }
    }

    @Override
    public E removeLast() throws NoSuchElementException {
        if(head == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }else{
            //preNode luon di sau thang curr 1 node
            Node <E> preNode = null;
            Node <E> delNode = head;
            while(delNode.getNext()!=null){
                preNode = delNode;
                delNode = delNode.getNext();
            }
            preNode.setNext(delNode.getNext());
            delNode.setNext(null);
            numNode--;
            return delNode.getData();
        }
    }

    @Override
    public void print() {
        if (head!=null){
            //lay node head
            Node <E> tmp = head;
            System.out.print("List: "+tmp.getData());
            tmp = tmp.getNext();
            while (tmp!=null){
                System.out.print("->" + tmp.getData());
                tmp=tmp.getNext();
            }
            System.out.println();
        }else{
            System.out.println("List is empty!");
        }
    }

    @Override
    public boolean isEmpty() {
        if(numNode==0) return true;
        return false;
    }

    @Override
    public E getFirst() throws NoSuchElementException {
        //kiem tra xem co ton tai hay khong
        if(head==null){
            throw new NoSuchElementException("Can't get element from an empty list");
        }else{
            return head.getData();
        }
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
        Node<E> tmp = head;
        while (tmp!=null){
            if(tmp.getData().equals(item)){
                return true;
            }
            tmp=tmp.getNext();
        }
        return false;
    }



}
