import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string for reverse : ");
        String str = sc.next();
        Reverse1(str);
        Reverse2(str);
        Reverse3(str);
        sc.close();
    }

    // this is method 1 by swapping and empty string
    public static void Reverse1(String str1) {
        System.out.println("this is DONE BY  method first");
        String empty = " ";
        for (int i = 0; i < str1.length(); i++) {
            empty = str1.charAt(i) + empty;
        }
        System.out.println(empty);
    }

    // This is method 2 by using String Builder
    public static void Reverse2(String str1) {
        System.out.println("this is DONE BY method second");
        StringBuilder  ans=new StringBuilder(str1);
        int n = ans.length();
        for(int i=0;i<n/2;i++){
            char firstChar=ans.charAt(i);
            char lastChar=ans.charAt(n-1-i);
            ans.setCharAt(i, lastChar);
            ans.setCharAt(n-1-i, firstChar);
        }
        System.out.println(ans.toString());

    }

    // this is method 3 by using CharArray
    public static void Reverse3(String str1) {
        System.out.println("this is DONE BY method third");
        char myArr[] = str1.toCharArray();
        int n = myArr.length;
        for (int i = 0; i < n / 2; i++) {
            char firstChar = myArr[i];
            char lastChar = myArr[n - 1 - i];
            myArr[i] = lastChar;
            myArr[n - 1 - i] = firstChar;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(myArr[i]);
        }

    }
}
