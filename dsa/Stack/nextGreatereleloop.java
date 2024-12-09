import java.util.*;
public class nextGreatereleloop {
    public static int[] nextgreat(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
            int currele=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]>currele){
                    ans[i]=arr[j];
                    break;
                }
            }
        }
        return ans;
    }
    public static void Traverse(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element: ");
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        Traverse(arr);
        int[] res=nextgreat(arr);
        Traverse(res);
        sc.close();

    }
    
}
