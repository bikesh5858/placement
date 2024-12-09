package dsa.LinkedList;

public class Addonetoll1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Reversell(Node head){
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            Node front =temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static Node Addonell(Node head){
       head=Reversell(head);
       Node temp=head;
       int carry=1;
       while(temp!=null){
        int sum=temp.data+carry;
        carry=sum/10;
        temp.data=sum%10;
        if(carry==0){
            break;
        }
        if(temp.next==null && carry!=0){
            temp.next=new Node(carry);
            break;
        }
        temp=temp.next;
       }
       head=Reversell(head);
       return head;

    }
    public static void Traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        System.out.println("Original list ");
        Traverse(head);
        System.out.println("list after adding 1 :  ");
        Node res=Addonell(head);
        Traverse(res);
    }

    
}
