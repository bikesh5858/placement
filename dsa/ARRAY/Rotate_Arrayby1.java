
import java.util.Scanner;

public class Rotate_Arrayby1 {
    public static void Rotate(int arr[],int n){
        int x[]=new int[n];
        for(int i =1; i<arr.length;i++){
            x[i-1]=arr[i];
        }
        x[n-1]=arr[0];
        System.out.println("Array after rotation of 1 place : ");
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(x[i]+" ");
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array :");
        int x = sc.nextInt();
        int Myarr[]=new int[x];
        for(int i=0; i<x;i++){
         
            System.out.print("enter the "+i+ " element to thte Array : ");
            int element=sc.nextInt();
            Myarr[i]=element;
        }
        Rotate(Myarr,x);
        sc.close();



    }
    
}
