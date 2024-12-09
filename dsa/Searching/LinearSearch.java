import java.util.*;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the size of Array : ");
        int x =sc.nextInt();
        int arr[]=new int[x];
        for(int i=0; i<x;i++){
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        System.out.println("Enter the value to search ");
        int y=sc.nextInt();
        for(int i=0;i<x;i++){
            if(y==arr[i]){
            System.out.print("Element found");
            }
            else {
                System.out.print("Not found ");
            }
        }
        sc.close();

    }
    

}
