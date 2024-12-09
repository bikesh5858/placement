import java.util.*;

public class BSrecursion {
     int BinarySearch(int arr[], int low, int high, int target) {
        if (high>=low) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return target;
        }if (arr[mid] > target) {
            return BinarySearch(arr, low, mid - 1, target);
        } else {
            return BinarySearch(arr, mid + 1, high, target);
        }
    }
    else{
        return -1;
    }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Note : Enetr element in sorted order ");
        System.out.print("Enter the length of Array : ");
        int x = sc.nextInt();
        int Myarr[] = new int[x];
        for (int i = 0; i < x; i++) {
            int ele = sc.nextInt();
            Myarr[i] = ele;
        }
        BSrecursion ob = new BSrecursion();
        System.out.print("Enter element to search : ");
        int target = sc.nextInt();

        int result = ob.BinarySearch(Myarr, 0, x - 1, target);
        if (result == -1) {
            System.out.println(" element not found");
        }
        else{
            System.out.println("Element found ");
        }
        
        sc.close();
    }

}
