package functions;

public class Fibonacci {

    public static int fibonacci(int x){
        int prev = 0, curr = 1, temp = 0;

        if(x == 0){
            return 0;
        }

        for(int i = 1;i < x; i++){
            temp = prev;
            prev = curr;
            curr += temp;
        }

        return curr;
    }
    public static void main(String[] args){
        System.out.println(fibonacci(4));
    }
}
