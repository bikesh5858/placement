package dsa.LinkedList;


public class OddEvengroup2 {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    public static ListNode oddEven(ListNode head){
        if(head == null || head.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode firstEven=head.next;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=firstEven;
        return head;

    }
    public static void main(String[] args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        display(head);
        ListNode result= oddEven(head);;
        display(result);
    }
    
}
