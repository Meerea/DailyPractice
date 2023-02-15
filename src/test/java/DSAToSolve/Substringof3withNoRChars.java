package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Substringof3withNoRChars {

    @Test
    public void test1() {
        String s = "xytzab";
        int k = 3;
        System.out.println(findSubstringChars(s, k));

    }
    private List<String> findSubstringChars(String s, int k) {
        String temp = "";
        int pointer = 0;
        List<String> l1 = new ArrayList<>();
        temp = s.substring(pointer, k);
        System.out.println(temp);

        for (; pointer<s.length() && k<=s.length();k += 1,pointer++) {
            Set<Character> set = new HashSet<>();
            int x = 0;
            while (x < temp.length()) {
                set.add(temp.charAt(x));
                x++;
            }
            if (set.size() == 3) {
                l1.add(temp);
            }
            temp = s.substring(pointer, k);
        }
        return l1;
    }
}
