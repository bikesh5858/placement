import java.util.*;

import java.lang.Integer;
class moveNegativeele{
    public static int[] moveneg(int arr[]){
        int l=arr.length;
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        for(int i=0;i<l;i++){
            if(arr[i]>0){
                st1.push(arr[i]);
            }
            else{
                st2.push(arr[i]);
            }
        }
            int res[]=new int[l];
            int index = l - 1;
    
            while (!st1.isEmpty()) {
                res[index--] = st1.pop();
            }
            while (!st2.isEmpty()) {
                res[index--] = st2.pop();
            }
        return res;
    }
    public static void display(int arr[]){
        int m=arr.length;
        for(int i=0;i<m;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        System.out.println("Original arr :");
        display(arr);
        System.out.println("Array After operation :");
        display(moveneg(arr));
        sc.close();
    }
    
}