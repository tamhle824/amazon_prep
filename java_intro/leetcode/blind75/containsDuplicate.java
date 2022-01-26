package leetcode.blind75;
// package leetcode;
import java.util.HashMap;
import java.util.Map;


public class containsDuplicate {

    public static void main(String[] args){
        int[] arry = {1,2,3,22,6,22};
        containsDuplicate cd = new containsDuplicate();
        // System.out.println(hasDuplicate(arry));
        System.out.println(cd.containsDuplicateTest(arry));
    }

    public boolean containsDuplicateTest(int[] nums){
        Map<Integer, Integer> mapList = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!mapList.containsKey(nums[i])){
                mapList.put(nums[i], i);
            }
            else if( mapList.containsKey(nums[i])){
                return true;
        }

        }
        return false;
    }
}
