package dsa.LinkedList;


public class sort120ss {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static ListNode sorttt(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode zerohead=new ListNode(-1);
        ListNode onehead=new ListNode(-1);
        ListNode twohead=new ListNode(-1);
        ListNode zero=zerohead;
        ListNode one=onehead;
        ListNode two=twohead;
        ListNode temp=head;

        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=temp;
            }
           else if(temp.data==1){
                one.next=temp;
                one=temp;
            }
           else if(temp.data==2){
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }
        zero.next=(onehead.next!=null)?onehead.next:twohead.next;
        one.next=twohead.next;
        two.next=null;
        ListNode newhead=zerohead.next;
        return newhead;
    }
     public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next = new ListNode(1);
        System.out.println("original list");
        display(head);
        System.out.println("after sort list");
        ListNode result=sorttt( head);
        display(result);
    }

    
}
