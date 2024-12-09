//package dsa.Queue;
public class CircularQueLLiml {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static class Circularll{
        int size=0;
        Node head=null;
        Node tail=null;
        void add(int val){
            Node temp=new Node(val);
            if(size==0){
                head=temp;
                tail=temp;
                tail.next=head;
            }
            else{
                tail.next=temp;
                tail=temp;
                tail.next=head;
            }
            size++;
        }
        int remove(){
            if(head==null){
                System.out.println("Queue is empty");
                return -1;
            }
            int x=head.val;
            if(head==tail){
                head=null;
                tail=null;
            }
            head=head.next;
            tail.next=head;
            size--;
            return x;
        }
        void display(){
            Node temp=head;
            if(head==null){
                System.out.println("Queue is empty");
                return;
            }
            else{
            while(temp.next!=head){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.print(temp.val);
            }
            System.out.println();
        }
        void peek(){
            if(head==null){
                System.out.println("empty Queue");
                return;
            }
            System.out.println("peek is: "+ head.val);
        }
    }
    public static void main(String[] args){
        Circularll cc=new Circularll();
        cc.add(1);
        cc.add(2);
        cc.add(3);
        cc.add(4);
        cc.add(5);
        System.out.println("Size is "+ cc.size);
        cc.peek();
        cc.display();
        cc.remove();
        cc.peek();
        System.out.println("Size is "+ cc.size);
        cc.display();
        cc.remove();
        System.out.println("Size is "+ cc.size);
        cc.display();
        cc.add(6);
        cc.peek();
        cc.display();
        System.out.println("Size is "+ cc.size);

    }
    
}
