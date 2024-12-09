package dsa.LinkedList;

import java.util.*;
import java.lang.Integer;

public class ReversellStack {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Reversell(Node head) {
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }

    public static void Traversell(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Original linked list");
        Traversell(head);
        System.out.println();
        Node res = Reversell(head);
        System.out.println("Reverse linked list ");
        Traversell(res);
    }
}
