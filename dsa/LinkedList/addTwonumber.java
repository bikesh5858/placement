package dsa.LinkedList;

public class addTwonumber {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node AddTwo(Node head1,Node head2){
        Node t1=head1;
        Node t2=head2;
        int carry=0;
        Node dummy =new Node(-1);
        Node temp=dummy;
        while(t1!=null || t2!=null || carry!=0){
            int sum=0;
            if(t1!=null){
                sum=sum+t1.data;
                t1=t1.next;
            }
            if(t2!=null){
                sum=sum+t2.data;
                t2=t2.next;
            }
            sum=sum+carry;
            carry=sum/10;
            Node xnode=new Node(sum%10);
            temp.next=xnode;
            temp=temp.next;
        }
        return dummy.next;
    }
   public static void main(String[] args){
    Node head1=new Node(3);
    head1.next=new Node(5);
    System.out.println("this is list 1 ");
    display(head1);

    Node head2=new Node(4);
    head2.next=new Node(5);
    head2.next.next = new Node(9);
    head2.next.next.next= new Node(9);
    System.out.println("this is list 2 ");
    display(head2);

    Node result=AddTwo( head1, head2);
    display(result);
   }
}
