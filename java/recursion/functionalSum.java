package recursion;
import java.util.*;

public class functionalSum {
    public static int  FunSum(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n+FunSum(n-1));
        }

    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter  the value ");
        int n=sc.nextInt();
        FunSum(n);
        System.out.print(FunSum(n));
        sc.close();
    }
    
}
