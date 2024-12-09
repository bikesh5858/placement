import java.util.*;

public class palindrome { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome:");
        String str = sc.next();
        boolean a = palindrome1(str);
        System.out.println(a);
        sc.close();
    }

    public static boolean palindrome1(String str1) {
        String empty = "";
        boolean ans = false;
        for (int i = 0; i < str1.length(); i++) {
            empty = str1.charAt(i) + empty;
        }
        if (str1.equals(empty)) {
            ans = true;
        }
        return ans;
    }
}
