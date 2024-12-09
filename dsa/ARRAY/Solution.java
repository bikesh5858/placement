

import java.util.Scanner;

public class Solution {
    public static void plusOne(int[] arr,int n) {
        for(int i=0;i<arr.length;i++){
           // int arr=digits[digits.length];
           

        }
        
    }
     public static void main (String[] args){
         Scanner sc =new Scanner(System.in);
         System.out.print("Enter the length of array : ");
         int x = sc.nextInt();
         int Myarr[]=new int[x];
         for(int i=0;i<x;i++){
        System.out.print("Enter the "+i +"th element of array : ");
        int element=sc.nextInt();
        Myarr[i]=element;
         }
         plusOne(Myarr,x);
         System.out.print("The second largest element is : ");
         sc.close();
    }

} 
    

