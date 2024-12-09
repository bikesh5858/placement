import java.util.Scanner;
public class Fourpattern {
    public static void pattern(int n)
    {
        for(int i = 0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
    Scanner sc = new Scanner (System.in);
    System.out.print("enter the height : ");
    int N = sc.nextInt();
    pattern(N);
    sc.close();
    }
    
}
/*-----output of above code 
enter the height : 5
1
22
333
4444
55555        
                 */
