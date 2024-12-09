

import java.util.Scanner;

public class Remove_Duplicate {
    public static int RemoveEle(int arr[], int n) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
                //System.out.println(arr[i]);
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int x = sc.nextInt();
        int Myarr[] = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the " + i + " th element to array :");
            int element = sc.nextInt();
            Myarr[i] = element;
        }
        int newSize=RemoveEle(Myarr, x);
        System.out.println("The no of unique element are: " + newSize);
        System.out.println("The unique elements are: ");
        for (int i = 0; i < newSize; i++) {
            System.out.println(Myarr[i] + " ");
        }
        sc.close();
    }

}
