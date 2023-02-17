public class MyQueue<E> {
    private MyStack<E> a= new MyStack<E>();
    private MyStack<E> b= new MyStack<E>();
    public MyQueue(){
    
    }
    public void Push(E data){
        a.push(data);
    }
    public void Pop(){
        while(!a.isEmpty()){
            while(!a.isEmpty()){
                b.push(a.pop());
            }
            E res=b.pop();
            while(!b.isEmpty()){
                a.push(b.pop());
            }
            System.out.println(res);
        }
        
    }
    
    public void print(){
        if(a.getTop()!=null){
            Node<E> tmp = a.getTop();
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
}
