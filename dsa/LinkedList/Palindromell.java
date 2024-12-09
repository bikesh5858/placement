package dsa.LinkedList;

import java.util.*;
import java.lang.Integer;
public class Palindromell {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean Checkpal(Node head){
        Node temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data!=st.peek()){
                return false;
            }
            st.pop();
            temp=temp.next;
        }
        return true;
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(1);
        boolean res=Checkpal(head);
        System.out.println("Is linked list is palidrome : "+res);


    }
    
    
}
