package dsa.LinkedList;
import java.util.*;
public class DetectCycle2pointer {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean hasCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node first=new Node(1);
        Node second=new Node (2);
        Node third = new Node(3);
        Node fourth =new Node(4);
        Node fifth =new Node(5);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth; 
        fifth.next=null;
        //fifth.next=third;       (to make a cycle un comment it)
        boolean res=hasCycle(first);
        if(res==true){
           System.out.println("have a Cycle");
        }
        else{
           System.out.println("Not have a Cycle");
        }
        sc.close();
    }
    
}
