
import java.util.*;
public class MoveZeroToEnd {
    public static int[] moveZero(int arr[]){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return arr;
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
    public static void printt(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the length of the Array : ");
        int x=sc.nextInt();
        int Myarr[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enetr the "+i + "th element in Array ");
            int element=sc.nextInt();
            Myarr[i]=element;
        }
        sc.close();
        moveZero(Myarr);
        printt(Myarr);
    }
}
