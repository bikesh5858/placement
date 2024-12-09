import java.util.*;
import java.lang.Integer;
public class stackRevwrse {
    public static void displayRec(Stack<Integer> st){
        if(st.size()==0){
            System.out.print(st);
            return ;   
        }
        int top=st.pop();
        System.out.print(top+" ");
        displayRec(st);
      //  System.out.println(top);
        st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack  " +st );
        System.out.print("Reverse Stack: ");
        displayRec(st);
        System.out.print(st);
       
    }
    
}
