//package dsa.ARRAY;

import java.util.Scanner;

public class Transpose_matrix {
    public static void Transpose_PrintArr(int arr[][]) {
        System.out.println("Element of array");
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                System.out.print(arr[i][j]+" ");
            }
           // arr[1][2] = 58; // direct update via traversing
           // arr[i][j] *= 2; // can be done any opration while traversing 
            System.out.println();
        }
    }
    public static void PrintArr(int arr[][]) {
        System.out.println("Element of array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
           // arr[1][2] = 58; // direct update via traversing
           // arr[i][j] *= 2; // can be done any opration while traversing 
            System.out.println();
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TwoDArr[][] = new int[3][3];
        int temp = 1;
        for (int i = 0; i < TwoDArr.length; i++) {
            for (int j = 0; j < TwoDArr[i].length; j++) {
                TwoDArr[i][j] = temp;
                temp++;
            }
        }
        System.err.println("before ");
        PrintArr(TwoDArr);
        System.out.println("After Transpose");
        Transpose_PrintArr(TwoDArr);
        sc.close();
    }
    
}
