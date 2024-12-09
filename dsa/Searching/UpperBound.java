import java.util.*;
public class UpperBound {
   static  int Upper(int arr[], int target,int len){
        int res=len;
        int low=0;
        int high=len-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res ;
    }
    public static void main(String[] args){

   
    Scanner sc = new Scanner (System.in);
    System.out.print("enter the length of the array : ");
    int x= sc.nextInt();
    int Myarr[]=new int[x];
    for(int i=0;i<x;i++){
        int ele=sc.nextInt();
        Myarr[i]=ele;
    }
    System.out.print("Enter the Searching element : ");
    int y=sc.nextInt();
    int result=Upper(Myarr,y,x);
    System.out.println(" the output for upper bound is : " +result );
    sc.close();

}

    
}
