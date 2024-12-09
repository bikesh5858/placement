package dsa.LinkedList;
public class LLlength{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static int  LLl(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args){
        Node a=new Node(5);
        Node b = new Node(4);
        Node c= new Node(6);
        Node d=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        int result =LLl(a);
        System.out.println("the length of the linked list is : "+result);
    }
}