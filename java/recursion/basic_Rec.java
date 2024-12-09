package recursion;
import java.util.*;
public class basic_Rec {
   
    public static void Name_print(int count,int x){
       
        
        if(count==x){
            return;
        }
        System.out.println(count+1+" Bikesh");
        count++;
        Name_print(count,x);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of time to print : ");
        int n =sc.nextInt();

        int count=0;
        Name_print(count,n);
        sc.close();

    }
    
}
