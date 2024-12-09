
package dsa.LinkedList;

import java.util.*;
public class Searchele {
    public static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean Search(int ele , Node head){
        Node temp=head;
        while(temp!=null){
            if(ele==temp.data){
                return true;
            }
            temp=temp.next; 
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Search element: ");
        int searchele=sc.nextInt();
        Node a=new Node(1);
        
        a.next=null;
       // b.next=c;
       // c.next=d;
       // d.next=null;
        boolean result=Search(searchele , a);
        if(result==true){
            System.out.println(" Element found !");
        }
        else{
            System.out.println(" Element not found !");
        }

        sc.close();

    }
    
}
