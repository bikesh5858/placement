package recursion;
import java.util.*;

public class Print1tonbutBacktrac {
    public static void BackPrint(int i,int n){
        if(i<1){
            return;
        }
        BackPrint(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value upto print");
        int n =sc.nextInt();
        BackPrint(n, n);
        sc.close();


    }
    
}
