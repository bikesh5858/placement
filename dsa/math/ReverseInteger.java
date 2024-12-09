import java.util.Scanner;

public class ReverseInteger{
    public static boolean isPalindrome(int n) {
        int rev_num=0; 
        int org = n;
   
        while(n>0){
            int ld=n%10;
            rev_num =( rev_num*10)+ld;
            n=n/10;
        }
       return rev_num==org;
    }
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the value to check palindrome : ");
    int N=sc.nextInt();
    boolean result = isPalindrome(N);
    System.out.println(result);
    sc.close();


    }
}