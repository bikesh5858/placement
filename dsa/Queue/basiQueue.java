
import java.util.*;
import java.util.LinkedList;
import java.lang.Integer;
public class basiQueue {
    
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("My Queue is : "+q);
        System.out.println("q.peek:"+q.peek());
        //System.out.println("My Queue is after remove : "+q);
        System.out.println(q.remove());
        System.out.println("q.element:"+q.element());
        System.out.println("q.poll :"+q.poll());
        System.out.println("My Queue is : "+q);
        System.out.println(q.remove());
        System.out.println("My Queue after remove : "+q);

    }

    
}
