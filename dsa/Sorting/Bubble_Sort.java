package dsa.Sorting;
import java.util.Scanner;

public class Bubble_Sort {
    public  static void  Bubble (int arr[], int n){
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

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
        Bubble(Myarr, x);
        After_sort(Myarr, x);
        sc.close();

    }
}
