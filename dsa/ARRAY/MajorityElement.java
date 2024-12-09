import java.util.*;

public class MajorityElement {
    public static int Majority(int nums[]){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                if(count>(n/2)){
                    return nums[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arr : ");
        int n = sc.nextInt();
        int myarr[] = new int[n];
        System.out.println("Enter the element in Array ");
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            myarr[i] = ele;
        }
        int result=Majority(myarr);
        System.out.println("Majority Element is:"+result);

        sc.close();

    }
}
