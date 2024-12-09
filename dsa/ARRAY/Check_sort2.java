
import java.util.Scanner;

public class Check_sort2 {
    public static Boolean CheckSorting(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] >= arr[j]) {
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the element : ");
        int x = sc.nextInt();
        int Myarr[] = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the" + i + "th element to array :");
            int element = sc.nextInt();
            Myarr[i] = element;
        }
        sc.close();
        CheckSorting(Myarr, x);
        System.out.print("Is array is sorted : " + CheckSorting(Myarr, x));

    }

}
