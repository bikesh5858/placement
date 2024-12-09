

import java.util.Scanner;

public class Rotate_Arrayby1_1 {
    public static void Rotate(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[n - 1] = temp;

        System.out.print("Array after rotation ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int x = sc.nextInt();
        int Myarr[] = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the " + i + " th element to Array ");
            int element = sc.nextInt();
            Myarr[i] = element;
        }
        Rotate(Myarr, x);
        sc.close();
    }

}
