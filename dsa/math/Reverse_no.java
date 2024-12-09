import java.util.*;
public class Reverse_no {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of no : ");
        int n =sc.nextInt();
        int Rev_no=0;
        while(n>0){
            int ld=n%10;
            Rev_no =Rev_no*10+ld;
            n=n/10;
        }
        System.out.print("The reverse no is "+Rev_no);
        sc.close();
    }
    
    
}
