package recursion;
import java.util.Scanner;

public class OneToN {
    public static void  Printt(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        Printt(i+1, n);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value upto print ");
        int n=sc.nextInt();
        Printt(1,n);
        sc.close();

    }
    
}
