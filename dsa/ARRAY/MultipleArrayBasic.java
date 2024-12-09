//package dsa.ARRAY;
import java.util.Scanner;
public class MultipleArrayBasic {
    public static void TraveseMultiArr(int arr[][]){
        System.out.println("Element of arrays are : ");
        for(int i=0;i<arr.length;i++){
            for(int j = 0 ; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int TwoDArr[][]=new int[3][3];
        
        System.out.println("enter the element in the array : ");
        for(int i=0; i<3; i++){           // i<3
            for(int j=0;j<3;j++){ 
              int element =  sc.nextInt();       //j<3
              TwoDArr[i][j]=element;
            }
            System.out.println();
        }
        TraveseMultiArr(TwoDArr);
        sc.close();

    }
    
}
