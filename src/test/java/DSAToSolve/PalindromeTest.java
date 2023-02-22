package DSAToSolve;

import org.junit.jupiter.api.Test;

public class PalindromeTest {


    @Test
    public void test1(){
        
    }

    public  boolean findPalindrome(String s) {

        int left = 0, right = s.length() - 1;
        char temp;
        while (right > left) {
            if (s.charAt(left) == s.charAt(right)) {
                right--;
                left++;
            } else if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }
        return true;

    }
}
