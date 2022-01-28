// package leetcode.blind75;
import java.util.Arrays;

public class productExceptSelf {
    
  

    public int[] pES(int[] nums){
        int n = nums.length;
        int[] arr = new int[n];

        int[] left_side  = new int[n];
        int[] right_side = new int[n];

        left_side[0] = 1;
        right_side[n-1] = 1;

    
        for (int i = 1; i < n; i++){
            left_side[i] = left_side[i-1] * nums[i-1];

        }
        for(int i = n-2; i >= 0; i--){
            right_side[i] = right_side[i+1] * nums[i+1];
        }
     
        for(int i = 0; i < n; i++){
            arr[i] = left_side[i] * right_side[i];
        }

        return arr;
    }

    public static void main(String[] args){
        productExceptSelf pe = new productExceptSelf();
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(pe.pES(arr)));



    }
}
