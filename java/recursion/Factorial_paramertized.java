package recursion;
import java.util.*;

public class Factorial_paramertized {
    public static void Fac(int i, int fact){
        if(i<1){
            System.out.print(fact);
            return;
        }
        Fac(i-1 ,fact*i);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enetr the value");
        int n=sc.nextInt();
        Fac(n,1);
        sc.close();
    }
    
}
