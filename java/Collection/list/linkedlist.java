package list;
import java.util.*;
public class linkedlist {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
       // LinkedList<String> list1 = new LinkedList<>(Arrays.asList("bikesh", "kumar", "hrishika"));
       // original list
       System.out.println("01 :"+list);
       list.add(7);
       System.out.println("02 :"+list);
       list.addFirst(0);
       list.addLast(8);
       list.add(1,5);
       System.out.println("03 :"+list);
       list.remove(1);
      list.remove(Integer.valueOf(0));
      System.out.println("04 :"+list);
      System.err.println("05 :"+list.get(3));
      System.err.println("06 :"+list.set(0,0));
      System.err.println("10 :"+list);
      System.err.println("07 :"+list.size());
      System.err.println("08 :"+list.peek());
      System.err.println("09 :"+list.poll());
      System.err.println("10 :"+list);
    }
    
}
