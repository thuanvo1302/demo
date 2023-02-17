
public class IntLinkedList {
    private Node head;
    public IntLinkedList(){};
    public void addFirst(int data){
        head= new Node(data, head);
    }
    public boolean addLast(int data){
        if(head==null){
            addFirst(data);
            return true;
        }else{
            Node tmp= head;
            while(tmp.getNext()!= null){
                tmp=tmp.getNext();
            }
            Node temp= new Node(data, null);
            tmp.setNext(temp);
            return true;
        }
    }
    public boolean removeAt(int position){
        Node tmp= head;
        int count=0;
        while(tmp!= null){
            tmp=tmp.getNext();
            count++;
        }
        tmp=head;
        Node pre= head.getNext();
        if(position>count) return false;
        else{
            if(position==1){
                head=head.getNext();
                return true;
            }else{
                count=2;

                while(pre!=null){
                    if(count==position){
                        tmp.setNext(pre.getNext());
                        return true;
                    }else{
                        tmp=pre;
                        pre=pre.getNext();
                        count++;
                    }
                }
                
            }
            

        }
        return false;
    }
    public void print(){
        if(head!= null){
            System.out.print("List "+head.getData());
            Node tmp=head.getNext();
            while(tmp!= null){
                System.out.print("->"+tmp.getData());
                tmp=tmp.getNext();
            }
            System.out.println();
        }else{
            System.out.println("List is empty!");
        }
    }
    public int countOdd(){
        Node tmp= head;
        int count=0;
        while(tmp!= null){
            if(tmp.getData()%2!=0){
                count++;
            }
            tmp= tmp.getNext();
        }
        return count;
    }
    public int searchKey(int key){
        Node tmp= head;
        int count=1,res=-1;
        while(tmp!= null){
            if(tmp.getData()==key){
                res=count;
            }
            tmp=tmp.getNext();
            count++;
        }
        return res;
    }
    public boolean checkSorted(){
        Node tmp=head;
        Node pre=tmp.getNext();
        while(tmp!=null){
            if(tmp.getData()<pre.getData()){
                return true;
            }
            
            tmp=tmp.getNext();
            pre=pre.getNext();
        }
        return false;
    }
}
