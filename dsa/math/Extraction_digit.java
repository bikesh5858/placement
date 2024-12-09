import java.util.*;
public class Extraction_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of digit : ");
        int n=sc.nextInt();
        while(n>0){
           int  last_Digit=n%10;
           System.out.print(last_Digit +" ");
           n=n/10;
        }
        sc.close();

    }
}
