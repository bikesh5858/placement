
import java.util.Scanner;

public class RightRotate {
    public static void Rotate(int arr[], int x){
        
        int n=arr.length;
        x=x%n;
        if(n==0||x>n){
            return;
        }
        int temp[]=new int[n];
        int j=0;
       for(int i=arr.length-x;i<arr.length;i++){
        temp[j]=arr[i];
        j++;
       }
       int k=0;
       for(int i=x;i<temp.length;i++){
        temp[i]=arr[k];
        k++;
       }


       for(int i =0;i<temp.length;i++){
        System.out.print(temp[i]+" ");
        if(i!=temp.length-1){
            System.out.print(" ,");
        }
       }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int x = sc.nextInt();
        int Myarr[] = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the " + i + " th element to Array ");
            int element = sc.nextInt();
            Myarr[i] = element;
        }
        System.out.print("Enter the place by which rotate ");
        int d=sc.nextInt();
        Rotate(Myarr, d);
        sc.close();
    }
    
}
