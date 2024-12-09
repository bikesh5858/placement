import java.util.Scanner;
public class Palindrome {
    public static void Palindromecheck(int n)
    {
        int original =n;
        int rev_num=0;

        while(n>0)
        {
           int  last_digit=n%10;
            rev_num = rev_num*10 +last_digit;
            n=n/10;
        }
if(rev_num==original)
{
    System.out.println(original+" this is an palindrome no ");
}
else 
System.out.println(original+" this is not a palindrome no .");
    }

    public static void main(String[] args)
    {
      Scanner sc = new Scanner (System.in);
      System.out.print("enter a no to check Palindrome:");
      int N= sc.nextInt();
      Palindromecheck(N);
      sc.close();

      
    }
    
}
