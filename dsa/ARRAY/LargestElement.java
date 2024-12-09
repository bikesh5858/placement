

//import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
     static int LargestEle(int arr[], int n) {
        /*
         * method 1
         * Arrays.sort(arr);
         * return arr[n-1];
         */
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
           
        }
   return max;

    }

    public static void PrintArr(int arr[]) {
        System.out.println("Element of Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int x = sc.nextInt();
        int Myarr[] = new int[x];

        for (int i = 0; i < Myarr.length; i++) {
            // int element;
            System.out.print("Enter the " + i + "th element to the array :");
            Myarr[i] = sc.nextInt();
        }
        PrintArr(Myarr);
        LargestEle(Myarr, x);
        /*
         * int largest = LargestEle(Myarr, Myarr.length);
         * // Print the largest element
         * System.out.println("The largest element in the array is: " + largest);
         */
        System.out.println("The largest element in the array is: " + LargestEle(Myarr,x

        ));
        sc.close();
    }

}
