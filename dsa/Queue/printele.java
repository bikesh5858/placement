import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.lang.Integer;

public class printele{
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Queue<Integer> tempQueue=new ArrayDeque<>();
        System.out.println("Revert before");
        System.out.println("the size of q is : "+q.size());
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            tempQueue.add(q.poll());
        }

        System.out.println();
        System.out.println(q);
        System.out.println(tempQueue);
        System.out.println("Revert back");

        while(tempQueue.size()>0){
            System.out.print(tempQueue.peek()+" ");
            q.add(tempQueue.poll());
        }
        System.out.println();
        System.out.println(q);
        System.out.println(tempQueue);


    }

}