import java.util.*;
import java.lang.Integer;
public class nextGreaterelemonost {
    public static void Traverse(int arr[]){
        System.out.print("Element of the array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] nextlargeEle(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int currEle=arr[i];
            while(!st.isEmpty() && st.peek()<=currEle){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(currEle);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element to array : ");
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        Traverse(arr);
        int res[]=nextlargeEle(arr);
        Traverse(res);
        sc.close();

    }
    
}
