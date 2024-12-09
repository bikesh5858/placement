package recursion;
import java.util.*;
public class FactByBack {
    public static int Fac(int n){
        if(n==0){
            return 1;
        }
        return (n*Fac(n-1));
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enetr the value : ");
        int n=sc.nextInt();
        Fac(n);
        System.out.println(Fac(n));
        sc.close();
    }
    
}



