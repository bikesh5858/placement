

import java.util.Scanner;

public class RotateByReverse {
  
    public static void Rotate(int arr[], int n, int x) {
        // Adjust x if it's greater than the length of the array
        x = x % n;
        
        // First, reverse the entire array
        Reverse(arr, 0, n - 1);
        
        // Then reverse the first part up to index x - 1
        Reverse(arr, 0, x - 1);
        
        // Finally, reverse the rest of the array from index x to n - 1
        Reverse(arr, x, n - 1);
    }
    
    public static void Reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int x = sc.nextInt();
        int Myarr[] = new int[x];
        
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the " + i + "th element to Array: ");
            int element = sc.nextInt();
            Myarr[i] = element;
        }
        
        System.out.print("Enter the place by which to rotate: ");
        int d = sc.nextInt();
        Rotate(Myarr, x, d);
        
        System.out.print("Rotated Array: ");
        for (int i = 0; i < x; i++) {
            System.out.print(Myarr[i] + " ");
        }
        sc.close();
    }
}
