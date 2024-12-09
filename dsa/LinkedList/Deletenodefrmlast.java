package dsa.LinkedList;
import java.util.*;
public class Deletenodefrmlast {
    public static  class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static ListNode Deletenth(ListNode head, int n){
        if(head==null){
            return head;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==n){
            ListNode newhead =head.next;
            return newhead;
        }
        int res=count-n;
    
         temp=head;
        while(temp!=null){
            res--;
            if(res==0){
                break;
            }
            temp=temp.next;
        }
        ListNode delNode =temp.next;
        System.out.println("you are deleting "+ delNode);
        temp.next=temp.next.next;
        return head;
    }
    public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        System.out.println("Original list ");
        display(head);
        System.out.println("enter the nth node want to delete");
        int n=sc.nextInt();
        ListNode result=Deletenth(head, n);
        System.out.println("List after deleting ");
        display(result);
        sc.close();
    }
    
}
