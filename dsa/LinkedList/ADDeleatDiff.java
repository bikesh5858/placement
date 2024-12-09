
package dsa.LinkedList;

import java.util.*;
public class ADDeleatDiff {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;

        // insert node at last index//

        void insert_at_end(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        // Insert node at head or at intial head
        void insert_at_head(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // Insert at specified index
        void Insert_At_Index(int value, int index) {
            Node temp = head;
            Node t = new Node(value);
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            if(index==0){
                insert_at_head(value);
                return;
            }
            else if(index<0 && index >size()){
                System.out.println("Wrong index value ");
                return;
            }
            else if(index==size()){
                insert_at_end(value);
                return;
            }
            else{
                t.next = temp.next;
                temp.next = t;
            }
            
        }
        // Display the linked list//

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            int count =0;
            Node temp = head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();
        ll.insert_at_end(5);
        ll.insert_at_end(6);
        ll.insert_at_end(7);
        ll.display();
        ll.insert_at_head(58);
        ll.display();
        ll.Insert_At_Index(77, 2);
        ll.display();
        int x=ll.size();
        System.out.println(x);
        ll.Insert_At_Index(83, 0);
       ll.display();
      // ll.Insert_At_Index(777, 7);
     // ll.display();
        ll.Insert_At_Index(177, 6);
        ll.display();
        sc.close();
    }
}
