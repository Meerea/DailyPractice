package DSAToSolve;

import org.junit.jupiter.api.Test;

public class SwapStringWithoutVariable {
    @Test
    public void test1() {
        String str1 = "good";
        String str2 = "day";
        swapStrings(str1,str2);
    }

    private void swapStrings(String s1, String s2) {
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1 + " " + s2);

    }
}
