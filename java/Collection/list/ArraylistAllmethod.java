package list;
import java.util.*;
//import java.lang.Integer;
public class ArraylistAllmethod {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        // method 1 : add(e Elemennt) : add element to the list
        list.add("Mango");
        list.add("Orange");
        list.add("Cherry");
        list.add("Grapes");
        System.out.println("01: "+list);
        /*System.out.print("1.1 :"+" ");
        for(String x:list){
            System.out.print(x+" ");
        }
        System.out.println();*/

        // add(int index , e element) : Add element at specific position
        list.add(0,"Apple");
        System.out.println("02: "+list);

        //sort()
        list.sort(null);
        System.out.println("2.1:"+list);

        //get(int index) retrive an element at that index
        System.out.println("03."+list.get(4));

        //set(int index, e element) : update element at that location
        list.set(0,"Coconut");
        System.out.println("04."+list);

        //remove(int index) : Remove an element by index 
        list.remove(0);
        System.out.println("05."+list);

        // remove(object o) : remove an element by value
        list.remove("Orange");
        System.out.println("06."+list);
        
        // size() : return the size of list
        System.out.println("07."+list.size());

        //isEmpty() : Check if the list is empty
        System.out.println("08."+list.isEmpty());

        // toArray() convert list to Array
        System.out.println("09."+list.toArray());

        //toString(toArray()) : print human  readale text
        System.out.println("10."+Arrays.toString(list.toArray()));
         
        list.add("cherry");
        //indexOf() : Return the index of first occurance of the element
        System.out.println("11."+list.indexOf("Cherry"));
        //System.out.println(list);

        // subList(int fromIndex , int toIndex) // print sublist
        System.out.println("12."+list.subList(1,3));
        
        //clear() : clear the list
        System.out.println("13. clear the list");
        list.clear();
        System.out.println("14."+list.isEmpty());
  
    }   
}
