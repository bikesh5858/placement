import java.util.Scanner;
class FirstPattern{
    public static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
      Scanner sc = new Scanner (System.in);
      System.out.print("Enter the no : ");
      int N =sc.nextInt();
      pattern(N);
      sc.close();

    }
}
/*Output the following code 
 * Enter the no : 5
X X X X X
X X X X X
X X X X X
X X X X X
X X X X X
 */