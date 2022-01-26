package leetcode.blind75;
import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static int[] tSum(int[] nums, int target) {
        Map<Integer, Integer> mapList = new HashMap<>();

        for(int i = 0; i < nums.length;i++){
            int complement = target - nums[i];

            if(mapList.containsKey(complement)){
                return new int[] { mapList.get(complement), i };
            }
            mapList.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args){
        int[] ar1 = {1,4,2,3};
        System.out.println(Arrays.toString(tSum(ar1,6)));
    }
    
}
