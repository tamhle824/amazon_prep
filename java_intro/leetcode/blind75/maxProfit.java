package leetcode.blind75;



public class maxProfit {

    public int mp(int[] prices){
  
        // for(int i = 0; i < prices.length;i++){
        //     for(int k = i+1;k < prices.length;k++){
        //         if (prices[i] < prices[k]){
        //             if(prices[k]-prices[i] > max){
        //                 max = prices[k] - prices[i];
        //             }
        //         }
        //     }

        // }
        int min = 99999;
        int max = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i]< min){
                min = prices[i];
            }
            
            else if(prices[i] - min > max){
                max = prices[i] - min;
            }

        }

        return max;
    }

    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        maxProfit m = new maxProfit();
        System.out.println(m.mp(arr));

    }
}
