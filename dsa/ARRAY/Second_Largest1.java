
import java.util.Scanner;

public class Second_Largest1 {
    public static int Largest(int arr[], int n) {
        if (n < 0 || n == 1) {
            return -1;
        } else {
            int max = arr[0];
            for (int i = 0; i < n; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }
        // return max;
    }

    public static int Second_Large(int arr[], int n,int a) {
        int sec_max = -1;
        for (int i = 0; i < n; i++) {
            if (sec_max<arr[i]&& arr[i]!=a) {
                sec_max = arr[i];
            }
        }
        return sec_max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int x = sc.nextInt();
        int Myarr[] = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the ith element too array :");
            Myarr[i] = sc.nextInt();
        }
        int A =Largest(Myarr, x);
        System.out.println("the largest element "+Largest(Myarr, x));
        System.out.println("the second largest element "+Second_Large(Myarr, x,A));
        

        sc.close();
    }

}
