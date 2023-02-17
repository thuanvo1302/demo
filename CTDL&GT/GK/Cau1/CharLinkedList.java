

public class CharLinkedList implements ListInterface {
    private Node head;
    // private int numNode;
    public CharLinkedList(){
        this.head=null;
    }
    public Node getHead(){
        return this.head;
    }
    public void addFirst(char data){
        head = new Node(data, head);
        // numNode++;
    }
    public boolean addAfterFirstKey(char data, char key){
        if(head==null) return false;
        else{
            Node tmp= head;
            while(tmp!=null){
                if(tmp.getData()==key){
                    Node temp= new Node(data,tmp.getNext());
                    tmp.setNext(temp);
                    return true;
                }
                tmp= tmp.getNext();
            }
        }
        return false;
    }
    public int largestCharPostition(){
        int res=0;

        if(head==null) return -1;
        else{
            Node tmp=head;
            int index=0;
            int max=(int)tmp.getData();
            while(tmp!=null){
                if((int)(tmp.getData())>max)
                {
                    res=index;
                }
                tmp=tmp.getNext();
                index++;
            }
        }
        return res;
    }
    public void print(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            System.out.println("List"+head.getData());
            Node tmp=head.getNext();

            while(tmp!=null){
                System.out.println("->"+tmp.getData());
                tmp=tmp.getNext();

            }
        }
    }
}
