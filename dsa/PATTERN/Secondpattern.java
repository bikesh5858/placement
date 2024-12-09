import java.util.Scanner;
class Secondpattern{
    public static void pattern(int rows, int cols)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
      Scanner sc = new Scanner (System.in);

      System.out.print("Enter the no of Rows  : ");
      int rows =sc.nextInt();

      System.out.print("Enter the no of columns  : ");
      int cols = sc.nextInt();
      
      pattern(rows, cols);
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
