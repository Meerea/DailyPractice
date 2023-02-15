package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class NiceSubstring {

    @Test
    public void test1(){
       String s = "YazaAay";
        System.out.println(longestNiceSubstring(s));
    }
    @Test
    public void test2(){
        String s = "AbaBa";
        System.out.println(longestNiceSubstring(s));
    }
    public String longestNiceSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (charSet.contains(Character.toUpperCase(s.charAt(i))) &&
                    charSet.contains(Character.toLowerCase(s.charAt(i)))) {
                continue;
            }
            String s1 = longestNiceSubstring(s.substring(0, i));
            String s2 = longestNiceSubstring(s.substring(i+1));
            return s1.length()>= s2.length() ? s1 : s2;
        }
        return s;
    }
}

