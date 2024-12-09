import java.util.*;
public class BSIterative {
    int BinarySearch(int arr[], int target){
        int low=0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid =(low+high)/2;
       if(low>high){
        return -1;
       }
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of Array : ");
        int x = sc.nextInt();
        int Myarr[] = new int[x];
        for (int i = 0; i < x; i++) {
            int ele = sc.nextInt();
            Myarr[i]=ele;
        }
        System.out.print("Enter element to Search ");
        int y =sc.nextInt();
        BSIterative ob =new BSIterative();
    int result=ob.BinarySearch(Myarr, y);
    if(result==-1){
        System.out.print("Element not found ");
    }
    else{
        System.out.print("element found  ");
    }
        sc.close();
    }

}
