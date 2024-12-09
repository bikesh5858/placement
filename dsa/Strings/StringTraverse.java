import java.util.*;

public class StringTraverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Name: ");
        String ex1 = sc.next();

        System.out.print("Enter last Name: ");
        String ex2 = sc.next();
        String ex3 = ex1 +" "+ ex2;

        System.out.println(ex3);
        PrintString(ex3);
        sc.close();

    }
    public static void PrintString(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }

}