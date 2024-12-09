package recursion;

import java.util.Scanner;

public class NameNtime {
    public static void Name_print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("bikesh");
        Name_print(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of time to print the Name : ");
        int n = sc.nextInt();
      //  System.out.print(" ");
        int i = 1;
        Name_print(i, n);

        sc.close();
    }

}
