package recursion;
import java.util.Scanner;
public class printnoReverse {
    public static void Printnp(int i) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        Printnp(i - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the max value upto print: ");
        int n = sc.nextInt();
        Printnp(n);
        sc.close();

    }

}
