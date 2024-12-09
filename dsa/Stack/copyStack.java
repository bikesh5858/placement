import java.util.*;
import java.lang.Integer;

public class copyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the no of element");
        int n = sc.nextInt();
        System.out.println("Enter the  elements");
        for (int i = 1; i <= n; i++) {
            int ele = sc.nextInt();
            st.push(ele);
        }
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> temp = new Stack<>();
        while (rt.size() > 0) {
            temp.push(rt.pop());
        }
        System.out.println(temp);
        System.out.println(st);

        sc.close();
    }

}
