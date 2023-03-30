package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
TestData1 - s = "abccccdd"
TestData2 -s= “aabbcccdd”
TestData3 - s=“aAbBcD”

Pseudocode:
1.Declare Map and add all the chars int it
2.Check the values and divisible by 2 and add those values to sum
3.if the values have odd and add it to list
4.Iterate list through for loop and add the values to sum and check condition for max value
5.Then subtract the current list value from sum value
6.Return the maximum val

 */

public class LengthPalindrome {

    @Test
    public void test1(){
        String s="abccccdd";
        System.out.println(findLength(s));
    }
    @Test
    public void test2(){
        String s="aabbcccdd";
        System.out.println(findLength(s));
    }
    @Test
    public void test3(){
        String s="aAbBcD";
        System.out.println(findLength(s));
    }

    public int findLength(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int val = Integer.MIN_VALUE, sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Character s1 : map.keySet()) {
            if (map.get(s1) % 2 == 0) {
                sum = sum + map.get(s1);
            } else if (map.get(s1) % 2 != 0) {
                list.add(map.get(s1));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
            val = Math.max(val, sum);
            sum = sum - list.get(i);
        }
        return val;
    }
}


