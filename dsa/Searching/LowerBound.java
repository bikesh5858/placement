import java.util.*;
public class LowerBound {
    public static int  Lower(int arr[] , int target ){
        int low=0;
        int n=arr.length;
        int high=n-1;
        int res=n;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]>=target){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int x=sc.nextInt();
        int Myarr[]=new int[x];
        for(int i=0; i<x;i++){
            int ele=sc.nextInt();
            Myarr[i]=ele;
        }
        System.out.println("enter element to search  ");
        int y=sc.nextInt();
        int result= Lower(Myarr,y);
        System.out.println("Out put is "+result);
        sc.close();

    }
}
