/*import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class OddEvengroup {
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
    }
    public static Node OddEven(Node head){
        if(head==null || head.next==null){
            return head;
        }
        List<Integer> array=new ArrayList<>();
        Node temp=head;
        while(temp!=null && temp.next!=null){
            array.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null){
            array.add(temp.data);
        }

        Node temp1=head.next;
        while(temp1!=null && temp1.next!=null){
            array.add(temp1.data);
            temp1=temp1.next.next;
        }
        if(temp1!=null){
            array.add(temp1.data);
        }
        temp =head;
        int i=0;
        while(temp!=null){
            temp.data = array.get(i);
            temp=temp.next;
            i++;
        }
        return head;

    }


    public static void main(String[] args){
        Node head= new Node(1);
        head.next=new Node (2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        display(head);
        Node result=OddEven(head);
       // System.out.println(result);
        display(result);



    }
    
}
    */
