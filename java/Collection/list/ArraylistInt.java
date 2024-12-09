package list;

import java.util.*;
import java.lang.Integer;
public class ArraylistInt {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        System.out.println(arr); 
        arr.sort(null);
        System.out.println(arr); 
        System.out.println(arr.get(3));
        for(int x:arr){
            System.out.print(x+" "); 
        }
        System.out.println();
        arr.remove(3);
        System.out.println(arr); 
        System.out.println(arr.contains(1)); 
        System.out.println(arr.size()); 
        arr.add(0,9);
        System.out.println(arr); 
        System.out.println(arr.indexOf(9));
        System.out.println(arr.isEmpty());
        //System.out.println(arr.sort());
        System.out.println(Arrays.toString(arr.toArray()));
        

        
    }
}
