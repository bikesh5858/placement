import java.util.*;
import java.lang.Integer;
public class AsteroidCollision {
    public static void Dispaly(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] asteroid(int arr[]){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            int val=arr[i];
            if(val>0){
                st.push(val);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<-val){
                   st.pop();
                }
                if(st.isEmpty() || st.peek()<0){
                    st.push(val);
                }
                if(!st.isEmpty() && st.peek()==-val){
                    st.pop();
                }
            }
        }
        int res[]=new int[st.size()];
            for(int i=st.size()-1;i>=0;i--){
                res[i]=st.pop();
            }
            return res;
        }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Arr :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the ele to array : ");
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        System.out.println("original Array : ");
        Dispaly(arr);
        System.out.println("Asteroid left : ");
        Dispaly(asteroid(arr));
        sc.close();
    }
    
}
