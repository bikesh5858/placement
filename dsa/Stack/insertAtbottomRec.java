import java.util.*;
import java.lang.Integer;
public class insertAtbottomRec{
    public static void InsertAtbottomRec(int n, Stack<Integer> st){
        int x=st.size();
        if(x==0){
            st.push(n);
            return;
        }
        int top=st.pop();
        InsertAtbottomRec(n, st);
        st.push(top);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack : "+st);
        System.out.print("Enter the element to enter :  ");
        int n=sc.nextInt();
        InsertAtbottomRec(n, st);
        System.out.print("New Stack : "+st);
        sc.close();
    }
}