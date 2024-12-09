
public class queueImpLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static class QueueAA{
        Node head=null;
        Node tail=null;
        int size=0;

        void add(int val){
            Node temp=new Node(val);
            if(size==0){
                head = temp;
               tail= temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }

        
      public  int peek(){
            if(size==0){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.val;
        }

        public int remove(){
            if(size==0){
                System.out.println("Empty Queue");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }

        void display(){
            Node temp=head;
            if(head==null){
                System.out.println("Queue is empty");
            }
            else{
                
                while(temp!=null){
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                }
            }
            System.out.println();
        }
        }
    
    public static void main(String[] args){
        QueueAA q=new QueueAA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println("the size is: "+q.size);
        System.out.println("the peek is: "+q.peek());
        q.remove();
        q.display();
        System.out.println("the peek is: "+q.peek());
        System.out.println("the size is: "+q.size);
        q.remove();
        q.display();

        System.out.println("the size is: "+q.size);
        System.out.println("the peek is: "+q.peek());

    }

}
