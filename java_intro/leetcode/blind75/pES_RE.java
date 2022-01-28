import java.util.Arrays;

public class pES_RE {
    
    static int left(int a[], int n){
        if (n == 0){
            return(a[n]);
        }
        else 
            return left(a,n-1) * a[n-1];
    }
    
    static int right(int a[], int n) {
        int x = a.length;
        if (n == x){
            return(a[n-1]);
      }
        else
            return right(a, x-(n-1) * a[x- (n-1)]);
    }


    public int[] pES(int[] nums){
        int n = nums.length;
        int[] arr = new int[n];

        int[] left_side  = new int[n];
        int[] right_side = new int[n];

        for (int i = 0; i < n; i++){
            left_side[i] = left(nums, i);

        }
        
        for (int i = 2; i < n; i++){
            right_side[n-i] = right(nums,i-2);
        }
     
        return right_side;
    }

    public static void main(String[] args){
        pES_RE pe = new pES_RE();
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(pe.pES(arr)));



    }
}