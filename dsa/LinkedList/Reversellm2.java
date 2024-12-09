package dsa.LinkedList;


public class Reversellm2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    } 
    public static Node Reversell(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;

    }
    public static void Traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main (String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Original linked list ");

        Traverse(head);
        Node res=Reversell(head);
        System.out.println("After reverse");
        Traverse(res);
    }
    
}
