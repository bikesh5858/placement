import java.util.*;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) 
            {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }

}