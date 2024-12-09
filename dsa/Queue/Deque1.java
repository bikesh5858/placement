import java.util.Deque;
import java.util.LinkedList;
import java.lang.Integer;

public class Deque1{
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
      
        dq.addFirst(10); 
        dq.addLast(20); 
        dq.addFirst(30);
        dq.addLast(30); 
        dq.addFirst(1); 
        dq.addLast(2); 
        dq.addFirst(3);
        dq.addLast(4);  
        System.out.println(dq);  
        
        System.out.println("Front: " + dq.peekFirst()); 
        System.out.println("Rear: " + dq.peekLast());  

        dq.removeFirst(); 
        System.out.println(dq);   
        dq.removeLast();
        System.out.println(dq);   
        System.out.println("Front: " + dq.peekFirst()); 
        System.out.println("Rear: " + dq.peekLast()); 
    }
}
