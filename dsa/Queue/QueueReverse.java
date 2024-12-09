import java.util.*;
import java.util.LinkedList;
import java.lang.Integer;
public class QueueReverse {
    public static void main(String[] args){
       Queue<Integer> q=new LinkedList<>();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       System.out.println("Before reverse : "+q);
       Stack<Integer> st=new Stack<>();
       while(q.size()>0){
        st.push(q.remove());
       }
       while(st.size()>0){
         q.add(st.pop());
       }
       System.out.println("After reverse : "+q);

    }
    
}
