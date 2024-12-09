package dsa.Sorting;

import java.util.*;

public class Selection_sort {
    public static void Selection(int arr[], int n) {
        for (int i = 0; i < n-1; i++) {
            int mini = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void After_sort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int x = sc.nextInt();
        int Myarr[] = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("enter the " + i + "th element to the array ");
            int element = sc.nextInt();
            Myarr[i] = element;
        }
        Selection(Myarr, x);
        After_sort(Myarr, x);
        sc.close();

    }

}
