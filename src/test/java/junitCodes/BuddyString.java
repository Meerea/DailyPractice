package junitCodes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuddyString {
    @Test
    void test1() {
        String s="ab";
        String goal="ba";
    }

    public boolean findBuddyString1(String s, String goal) {
        int count = 0;
        //ab,ab
        if(s.length() != goal.length()) {
            return false;
        }
        Set<Character> set = new HashSet<Character>();
        if(s.equals(goal)) {
            for (char c : s.toCharArray()) {
                set.add(c);
            }
            return set.size() < s.length();
        }
        else {
            List<Integer> list = new ArrayList<Integer>();  //ab, ba  //s=ab goal = cd
            for (int i = 0;i<s.length();i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    list.add(i);  //0,1
                }
            }
            return list.size() == 2 && s.charAt(list.get(0)) == goal.charAt(list.get(1))
                    && goal.charAt(list.get(0)) == s.charAt(list.get(1));

        }
    }
}
