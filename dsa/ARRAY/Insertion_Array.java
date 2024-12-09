

import java.util.Scanner;

public class Insertion_Array {
    public static void Array_Insertion(int arr[] ,int ele , int pos) {
        int size =arr.length;
        if(pos<0||pos>=size-1)
        {
            System.out.println("Arraay index out of bound ");
            return;
        }
        for(int i =size-2;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=ele;
    

    }
    public static void Print_Arr(int n[])
    {
        for(int i=0; i<n.length;i++)
        {
            System.out.println(i+1+"th position  element of arrays is  : "+n[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll_no[] = new int[5];
        System.out.println("Enter the element to the array ");
        for (int i = 0; i < 3; i++) {
            System.out.print("enter " + i + " element to the array ");
            int element = sc.nextInt();
             roll_no[i]=element;
        }
        System.out.print("Enter the Element to insert :  ");
        int x =sc.nextInt();
        System.out.print("Enter the Position at insert :  ");
        int y =sc.nextInt();
        Array_Insertion(roll_no, x, y);
        Print_Arr(roll_no);
        sc.close();
    }

}
