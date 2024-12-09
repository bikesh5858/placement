package recursion;
// this is done via parameterized recursion
import java.util.*;

public class SumUptoN {
    public static void Summ(int i, int sum) {
        if (i < 1) {
            System.out.print(sum);
            System.out.println();
            return;
        }
        Summ(i - 1, sum + i);

        System.out.print(i + "+");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value upto sum :");
        int n = sc.nextInt();

        Summ(n, 0);
        sc.close();

    }

}
