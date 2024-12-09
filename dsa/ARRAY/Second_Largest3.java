

import java.util.Scanner;
public class Second_Largest3 {
    public static int Sec_largest(int arr[],int n){
        int largest=arr[0];
        int sec_larg=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                sec_larg=largest;
                largest=arr[i];
            }
            else if(arr[i]!=largest && arr[i]>sec_larg){
                sec_larg=arr[i];
            }
        }
        return sec_larg;
           
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
         Sec_largest(Myarr,x);
         System.out.print("The second largest element is : "+Sec_largest(Myarr, x));
         sc.close();
    }
    
    
}
