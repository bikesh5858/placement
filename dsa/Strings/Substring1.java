import java.util.*;
public class Substring1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a substring : ");
        String str1 = sc.next();
        Substring2(str1);
        sc.close();
    }
    public static void Substring2(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                String substr = str.substring(i, j);
                System.out.println(substr);
            }
        }
    }
}