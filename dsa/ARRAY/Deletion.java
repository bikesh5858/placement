//package dsa.ARRAY;
import java.util.Scanner;

public class Deletion {
    public static void Deletion_array(int arr[], int pos) {
        if(pos<0 || pos>arr.length-1){
            System.out.println("Array out of bound error");
            return;
        }
        else
        for(int i=pos; i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
    }
  public static  void PrintArr(int myArr[])
    {
        for(int i=0; i<myArr.length;i++){
            System.out.print(myArr[i]+" ");
        }
    }

    public static void main(String[] args) {
       
        int myArr[] = new int[4];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element of array : ");
        for(int i = 0;i<4;i++)
        {
            System.out.print(i+ "th element of array ");
            int element=sc.nextInt();
            myArr[i]=element;
        }
        System.out.print("Array before deletion : ");
      PrintArr(myArr);
      System.out.println();
      System.out.print("enter position to delete : ");
      int position =sc.nextInt();
      Deletion_array(myArr, position);
      System.out.print("Array after deletion : ");
      PrintArr(myArr);

        sc.close();

    }
}