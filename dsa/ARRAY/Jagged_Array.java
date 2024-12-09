//package dsa.ARRAY;
import java.util.Scanner;
public class Jagged_Array {
    public static void Print_JaggedArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                /*
                 * if(i!=arr.length-1){
                 * System.out.print(" , ");//for comma in output.
                 * }
                 */
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int x = sc.nextInt();
        int JagArr[][] = new int[x][];
        // JagArr[1]=new int["enter no of size in this "]
        // or JagArr[0]=new int[]{99,88,77} to declare the array.
        for (int i = 0; i < x; i++) {
            JagArr[i] = new int[i + 1];
        }

        int k = 0;
        for (int i = 0; i < JagArr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                JagArr[i][j] = k;
                k++;
            }
        }
        Print_JaggedArr(JagArr);
        sc.close();

    }

}
