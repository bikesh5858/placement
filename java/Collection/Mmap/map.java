package Mmap;
import java.lang.Integer;
import java.util.HashMap;
public class map {
    public static void main(String[] args){
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"bikesh");
        map.put(2,"hrishika");
        map.put(3,"kumar");
        map.put(4,"sah");
        System.out.println(map);
        System.out.println(map.get(1));//bikesh
        System.out.println(map.get(5));//null
        System.out.println(map.remove(4));//sah
        System.out.println(map.containsKey(4));//false
        System.out.println(map.containsValue("kumar"));//true
        System.out.println(map.size());//3
        System.out.println(map.isEmpty());//false
        map.putIfAbsent(4,"sah");
        map.replace(3,"kumar","yadav");
        map.put(4,"ram");
        System.out.println(map.keySet());//1234
        System.out.println(map.values());//bikesh hrishika yadav sah



    }
    
}
