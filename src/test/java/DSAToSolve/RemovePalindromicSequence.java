package DSAToSolve;

import org.junit.jupiter.api.Test;

public class RemovePalindromicSequence {
    @Test
    public void test1(){
      String s = "ababa";
      removePalindromeSub(s);

    }
    @Test
    public void test2(){
        String s = "abb";
        removePalindromeSub(s);
    }
    public int removePalindromeSub(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return 2;
            }
        }
        return 1;
    }
}


