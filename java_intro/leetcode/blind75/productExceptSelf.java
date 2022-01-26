// package leetcode.blind75;
import java.util.Arrays;

public class productExceptSelf {
    
    public int[] pES(int[] nums){
        int[] arr = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            int product = 1;
            for(int k = i+1;k<nums.length; k++){
                product = product * nums[k];
            }
            arr[i] = product;
        }
        return arr;
    }

    public static void main(String[] args){
        productExceptSelf pe = new productExceptSelf();
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(pe.pES(arr)));

    }
}
