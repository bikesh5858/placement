import java.util.*;
import java.util.LinkedList;
import java.lang.Integer;
public class ReverseQueueuptokele {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q =new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Befor Reverse: "+q);
        System.out.print("Enter the k value upto rotation :2 ");
        int k=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println("After k time Reverse: "+q);
        int n=q.size();
        for(int i=0;i<n-k;i++){
            q.add(q.remove());
        }
        System.out.println("final answer Reverse: "+q);
        sc.close();
    }
}
