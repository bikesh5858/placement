package dsa.Sorting;

import java.util.*;

public class insertion_sort {
    public static void Insertion(int arr[], int n) {
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp =arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int x = sc.nextInt();
        int Myarr[] = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the " + i + "th element to array : ");
            int element = sc.nextInt();
            Myarr[i] = element;
        }
        Insertion(Myarr, x);
        sc.close();
    }

}
