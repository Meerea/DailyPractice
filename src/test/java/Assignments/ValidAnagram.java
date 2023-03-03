package Assignments;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/*

TestData1-s = "anagram", t = "nagaram"
TestData2-s = "rat", t = "car"
TestData3-s = "good", t = "fair";

Pseudocode:
1.Declare Map and add all the chars of string s
2.Iterate string t using for loop and check conditon, map contains t's chars
    if available decrease the count value of char and add in map - return true
    else return false
3.Also check the entry set value of map and check value not equals zero - return false


 */

public class ValidAnagram {

    @Test
    public void test1(){
      String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    @Test
    public void test2(){
        String s = "rat", t = "car";
        System.out.println(isAnagram(s,t));
    }
    public boolean isAnagram(String s, String t) {
        boolean flag = false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
            else return false;
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()!=0)
                return false;

        }
        return true;
    }

}

