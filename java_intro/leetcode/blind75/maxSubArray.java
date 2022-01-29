
public class maxSubArray {
    // using kadane's alogrithm
    //started with brute force which is n^2
    //

    public int msa(int[] nums){
        int sum_total = Integer.MIN_VALUE;
        int temp_total = 0;

        for(int i = 0; i < nums.length;i++){           

            // temp_total += nums[i]; // start off adding first interation to temp_total;
        
            // if(temp_total < nums[i]){
            //     temp_total = nums[i];
            // }
            // if(temp_total > sum_total){
            //     sum_total = temp_total;
            // }            

            temp_total = Math.max(nums[i], temp_total + nums[i]);
            sum_total = Math.max(sum_total, temp_total);
        }

        return sum_total;

    }

    public static void main(String[] args){
        maxSubArray msa = new maxSubArray();
        int[] arr = {-2,1,-3,4};
        System.out.println((msa.msa(arr)));
    }
}


