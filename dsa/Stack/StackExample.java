import java.util.Stack; 
import java.lang.Integer;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        stack.push(1); 
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();

        System.out.println(stack); 
        System.out.println(stack.peek()); 
        System.out.println(stack.size()); 
        System.out.println(stack.isEmpty());
   
    }
}
