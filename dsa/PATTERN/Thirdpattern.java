import java.util.Scanner;
public class Thirdpattern {
    public static void pattern(int n)
    {
        for(int i=0;i<=n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(j+1);
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
/*output of the following code 
 * enter the height : 5

1    
12   
123  
1234 
12345
               */
