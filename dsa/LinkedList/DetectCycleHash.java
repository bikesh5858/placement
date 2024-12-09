package dsa.LinkedList;

import java.util.*;
import java.lang.Integer;
public class DetectCycleHash {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean checkCycle(Node head){
        Node temp=head;
        HashMap<Node,Integer> hash1=new HashMap<>();
        while(temp!=null){
            if(hash1.containsKey(temp)){
                return true;
            }
            hash1.put(temp, 1);
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     Node first=new Node(1);
     Node second = new Node(2);
     Node third = new Node(3);
     Node fourth =new Node(4);
     Node fifth =new Node(5);
     first.next=second;
     second.next=third;
     third.next=fourth;
     fourth.next=fifth; 
     fifth.next=null;
     //fifth.next=third;
     boolean res=checkCycle(first);
     if(res==true){
        System.out.println("have a Cycle");
     }
     else{
        System.out.println("Not have a Cycle");
     }
     sc.close();


    }
    
}
