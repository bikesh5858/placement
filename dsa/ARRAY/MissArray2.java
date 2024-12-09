//import java.util.HashSet;
import java.util.Scanner;

public class MissArray2 {
  /*  public static int Missing(int []arr) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;  // If all numbers from 1 to n are present, return 0
    }
        */ 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int x = sc.nextInt();
        int myarr[] = new int[x];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < x; i++) {
            myarr[i] = sc.nextInt();
        }
       // int res = Missing(myarr);
       System.out.println("The missing element is: " );
        sc.close();
    }
}
