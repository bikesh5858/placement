import java.util.Scanner;
public class FifthPattern {
    public static void pattern(int n)
    {
      for(int i =0; i<n;i++)
      {
        for(int j =n; j>i; j--)
        {
            System.out.print("* ");
        }
        System.out.println();
      }
    }
    public static void main(String[] args)
    {
      Scanner sc = new Scanner (System.in);
       System.out.print("enter the no of row : ");
      int N = sc.nextInt();
      pattern(N);
      sc.close();

    }
    
}
/* output of code
  enter the no of row : 5
* * * * * 
* * * *   
* * *     
* *       
*
 -----------------*/
