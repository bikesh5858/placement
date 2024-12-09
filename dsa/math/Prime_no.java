import java.util.*;
public class Prime_no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n= sc.nextInt();
        int count=0;
       for(int i=1;i<=n;i++){
        if((n%i)==0){
            count++;
        }
       }
       System.out.println(count);
       if(count==2){
        System.out.print("It is prime no");
       }
       else {
        System.out.print("not a prime no");
       }
sc.close();

    }


    
}
