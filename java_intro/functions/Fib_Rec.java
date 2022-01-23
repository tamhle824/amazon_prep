package functions;

public class Fib_Rec {

    public static int fib2(int x){
        if(x == 0){
            return 0;
        }
        else if( x == 1 || x == 2){
            return 1;
        }
        else {
            return fib2(x-1) + fib2(x-2);
        }
    }
    public static void main(String[] args){
        System.out.println(fib2(8));

    }
    
}
