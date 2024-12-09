
import java.util.*;
public class Armstrong_no {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the value of no : ");
        int n=sc.nextInt();
        int org=n;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
        }
        if(sum==org){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
        sc.close();
        

        

    }
    
}
