//package dsa.ARRAY;
import java.util.Scanner;
public class Traverse_Array {

    public static void Traverse_Arr(int arr[]) {
        System.out.println("Elementof an array are : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int roll_no[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < roll_no.length; i++) {
            System.out.print("enter "+i +" element in the array : ");
            int element = sc.nextInt();
            roll_no[i]=element;
           // System.out.println(roll_no[i]);
            
        }
        Traverse_Arr(roll_no);
        sc.close();
    }

}
