package DSAToSolve;

import org.junit.jupiter.api.Test;

public class PowerOfThree {
    @Test
    public void test1(){
       // int n=27;
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(-3));
        System.out.println(isPowerOfThree(-1));
        System.out.println(isPowerOfThree(-45));
        System.out.println(isPowerOfThree(39));
    }
    public boolean isPowerOfThree(int n) {

        if(n < 1) return false;
        for(; n != 1; n /= 3) if(n % 3 != 0) return false;
        return true;
    }
}
