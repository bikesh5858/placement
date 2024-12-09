import java.util.*;
import java.lang.Integer;

public class InsertAtBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Original Stack ");
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            rt.push(st.pop());
        }

        System.out.println("Enter the element to insert at bottom ");
        int x = sc.nextInt();
        st.push(x);
        while (rt.size() > 0) {
            st.push(rt.pop());
        }
        System.out.println("new Stack ");
        System.out.println(st);
        sc.close();
    }

}
