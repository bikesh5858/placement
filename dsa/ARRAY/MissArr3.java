import java.util.Scanner;

public class MissArr3 {
    public static int Missing(int[] arr) {
        int N = arr.length;
        int sum1 = 0;
        for (int i = 0; i <=N; i++) {
            sum1 = sum1 + i;
        }
        int sum2 = 0;
        for (int j = 0; j < N - 1; j++) {
            sum2 = sum2 + arr[j];
        }
        int x=sum1-sum2;
        return x;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int x = sc.nextInt();
        int myarr[] = new int[x];
        System.out.println("enter the element of the Array : ");
        for (int i = 0; i < x; i++) {
            int ele = sc.nextInt();
            myarr[i] = ele;
        }
        int res = Missing(myarr);
        System.out.print("Missing element is : " + res);
        sc.close();
    }

}
