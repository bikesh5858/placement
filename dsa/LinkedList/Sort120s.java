package dsa.LinkedList;

public class Sort120s {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Sortingby120(Node head){
        int c0=0 ,c1=0 , c2=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                c0++;
            }
            else if(temp.data==1){
                c1++;
            }
            else if(temp.data==2){
                c2++;
            }
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(c0>0){
                temp.data=0;
                c0--;
            }
            else if(c1>0){
                temp.data=1;
                c1--;
            }
            else if(c2>0){
                temp.data=2;
                c2--;
            }
            temp=temp.next;
        }
        return head;
    }



    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next= new Node(0);
        head.next.next=new Node(2);
        head.next.next.next= new Node(1);
        head.next.next.next.next= new Node(2);
        head.next.next.next.next.next=new Node(2);
        display(head);
       Node result= Sortingby120(head);
        display(result);

        
    }
    
}
