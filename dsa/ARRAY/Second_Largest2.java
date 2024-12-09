
import java.util.Arrays;
import java.util.Scanner;
public class Second_Largest2 {
    public static void Sec_larg(int arr[],int n){
        n= arr.length;
        Arrays.sort(arr);
        int largest = arr[n-1];
        System.out.println("Largest element is : "+largest);
        int Sec_largest = -1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=largest){
               Sec_largest=arr[i];
              break; 
            }   
        }
        
            System.out.println("Second largest element is : " + Sec_largest);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int length = sc.nextInt();
        int Myarr[]=new int[length];
        for(int i =0; i<Myarr.length; i++){
            System.out.print("Enter the "+i +"th element to the array: ");
            int element=sc.nextInt();
            Myarr[i]=element;
        }
        Sec_larg(Myarr, length);
        sc.close();
    }
    
}
