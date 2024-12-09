public class implementStackLL {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class LLStack {
        Node head = null;
        int size = 0;
        void push(int x) {
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        int pop() {
            if(head==null){
                System.out.println("Stack is empty ");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }

        int  peek() {
            if(head==null){
                System.out.println("Stack is empty ");
                return -1;
            }
            return head.val;
        }
        void display() {
             displayRec(head);
             System.out.println();
        }
        void displayRec(Node h){
            if(h==null){
                return ;
            }
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        boolean isEmpty(){
            if(head==null){
                return true;
            }
            else return false;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.push(3);
        st.display();
        st.push(4);
        st.display();
        int peek=st.peek();
        System.out.println("Peek element is:"+ peek);
        st.pop();
        st.display();
        System.out.println("the size of stack is :"+ st.size);

    }

}
