package dsa.LinkedList;
public class reversetraverse{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void reverse(Node head){
        if(head ==null){
            return;
        }
        reverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String[] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        reverse(a);
    }
}