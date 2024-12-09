public class ImplementStackArr {
    public static class Stack {
        int arr[] = new int[5];
        int index = 0;

        // push function
        void push(int n) {
            if (isFull()) {
                System.out.println("Stack is full !");
                return;
            }
            arr[index] = n;
            index++;
        }

        // pop function
        int pop() {
            if (isEmpty()) {
                System.out.println("Stackis empty! ");
                return -1;
            }
            int top = arr[index - 1];
            arr[index - 1] = 0;
            index--;
            return top;
            
        }

        // peek function
        int peek() {
            return arr[index - 1];
        }

        // display function
        void display() {
            for (int i = 0; i < index ; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // size function
        int size() {
            return index;
        }

        // Capacity function
        int capacity() {
            return arr.length;
        }

        // check stack full
        boolean isFull() {
            if (index == arr.length) {
                return true;
            } else
                return false;
        }

        // Check Stack is empty
        boolean isEmpty() {
            if (index == 0) {
                return true;
            } else
                return false;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.push(3);
        st.display();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
System.out.println();
        int result =st.peek();
        System.out.println("now peek is "+result);
        st.pop();
        st.display();
    }

}
