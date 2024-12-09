package dsa.LinkedList;
public class traverseLL {
    public static class node {
        int data;
        node next;
        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void traverse(node a) {
        node temp = a;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        traverse(a);
    }
}