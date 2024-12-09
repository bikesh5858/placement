package dsa.LinkedList;


public class deleteNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        int size=0;

        //INSERT LINKED LIST AT END 
        void insert_at_end(int value){
            Node temp=new Node(value);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        //delete at begining
        void delete(int index){
            System.out.println();
            Node temp=head;
            if(index==0){
                System.out.println("deletion of head");
               head=head.next;
               temp=null;
            }
            else if (index == size - 1) {
                System.out.println("deletion of tail");
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = null;  
                tail = temp;     
            }
            else{
                System.out.println("deletion of random index");
                for(int i=0;i<index-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                temp=null;
            }
           
           size--;
        }
        void show(){
            System.out.println("Now my head is at "+head.data);
            System.out.println("Now my tail is at "+tail.data);
            System.out.println("current size is "+size);

        }
    }
    public static void main(String[] args){
        LinkedList ll= new LinkedList();
        ll.insert_at_end(1);
        ll.insert_at_end(2);
        ll.insert_at_end(3);
        ll.insert_at_end(4);
        ll.insert_at_end(5);
        ll.display();
        ll.show();

        ll.delete(0);
        ll.display();
        ll.show();

        ll.delete(2);
        ll.display();
        ll.show();

        ll.delete(2);
        ll.display();
        ll.show();
        
        

        

    }
    
}
