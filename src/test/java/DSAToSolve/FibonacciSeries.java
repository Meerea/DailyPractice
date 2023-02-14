package DSAToSolve;

import org.junit.jupiter.api.Test;

public class FibonacciSeries {

    @Test
    public void test1(){
        int n=2;
        System.out.println(fib(n));
    }
    public int fib(int n) {

        if(n == 0 || n == 1)
            return n ;
        int result = fib(n - 1) + fib(n -2);
        return result;
    }
}

