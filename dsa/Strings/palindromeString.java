import java.util.*;
public class palindromeString { 
 

    public static boolean palindrome1(String str1) {
        System.out.println("Done by method 1");
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

    public static boolean palindrome2(String str1) {
        System.out.println("Done by method 2");
        int start=0;
        int end=str1.length()-1;
        while(start<end){
            if(str1.charAt(start)!=str1.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
       
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome:");
        String str = sc.next();
        boolean a = palindrome1(str);
        System.out.println(a);

        boolean b= palindrome2(str);
        System.out.println(b);

        sc.close();
    }
}
