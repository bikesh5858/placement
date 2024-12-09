import java.util.*;
public class Count_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of no : ");
        int n=sc.nextInt();
        int count =0;
        while(n>0){
           // int ld=n%10;
           count ++;
            n=n/10;
          //  System.out.println(ld);
        }
        System.out.println(count);
        
        sc.close();

        
    }
    
}
