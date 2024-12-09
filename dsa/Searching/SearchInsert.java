import java.util.*;

public class SearchInsert {
    public static int FindIndex(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int res = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public static int Insert(int arr[], int a,int target) {
        int n=arr.length;
        for(int i=n-2;i>=a;i--){
            arr[i+1]=arr[i];
            
        }
        arr[a]=target;
        return 0;
    }

    public static void printt(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int x = sc.nextInt();
        int Myarr[] = new int[x+1];
        for (int i = 0; i < x; i++) {
            int ele = sc.nextInt();
            Myarr[i] = ele;
        }
        System.out.println(" enter the target value : ");
        int y = sc.nextInt();
        int result = FindIndex(Myarr, y);
        System.out.println("Inserted at index "+result );
        Insert(Myarr, result,y);
        printt(Myarr);
        sc.close();

    }

}
