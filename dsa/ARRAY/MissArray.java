import java.util.*;
public class MissArray{
    public static int Missing(int arr[], int N) {
        for (int i = 1; i <=N; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i){
                    flag = 1;
                    break;
                }   
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int x=sc.nextInt();
        int myarr[]=new int[x];
        System.out.println("enter the element of the Array : ");
        for(int i=0;i<x;i++){
            int ele=sc.nextInt();
            myarr[i]=ele;
        }
        int res=Missing(myarr, x);
        System.out.print("Missing element is :"+res);
sc.close();
    }
}
