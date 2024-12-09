import java.util.*;
public class LongestSumarr {
    public static int lenOfLongSubarr (int A[], int N, int K) {
       // int n=A.length;
        int left=0; int right=0; 
        int sum=A[0];
        int maxLen=0;
        while(right<N){
            while(left<=right&& sum>K){
                sum=sum-A[left];
            }
            if(sum==K){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<N){
                sum=sum+A[right];
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the length of Array");
        int x=sc.nextInt();
        int Myarr[]= new int[x];
        for(int i=0;i<x;i++){
            int ele=sc.nextInt();
            Myarr[i]=ele;
        }
        System.out.print("Enter the targe Sum ");
        int y=sc.nextInt();
        sc.close();
int res=lenOfLongSubarr(Myarr, x, y);
System.out.println(" the longest sum Array length  is "+ res);
    }
    
}
