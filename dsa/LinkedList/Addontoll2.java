package dsa.LinkedList;

public class Addontoll2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private static int helper(Node temp){
        if(temp==null){
            return 1;
        }
        int carry=helper(temp.next);
        temp.data=temp.data+carry;
        if(temp.data<10){
            return 0;
        }
        temp.data=0;
        return 1;
    }
    public static Node addOnell(Node head){
        int carry=helper(head);
        if(carry==1){
            Node newNode=new Node(carry);
            newNode.next=head;
            head=newNode;
        }
        return head;
    } 
    public static void Traversell(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head=new Node(9);
        head.next=new Node(9);
        head.next.next=new Node(9);
        System.out.print("Original list : ");
        Traversell(head);
        System.out.print("list after add one  : ");
        Node res=addOnell(head);
        Traversell(res);
    }
}
