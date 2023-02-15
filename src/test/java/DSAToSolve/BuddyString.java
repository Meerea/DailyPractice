package DSAToSolve;


/*
   TestData 1- s1 = "ab", goal = "ab"
   TestData 2- s1 = "aa", goal = "aa";
   TestData 3- s1 = "ac", goal = "ac "

        1. if both string lengths are not equal return false
        2. if both string contents are equal put them in set and if the set size is less than string length return true
        3.if both string contents are not equal but the lengths are equal then create the array list,
        iterate the strings if the characters are not matching at particular index add that index position to the set.
        4. ArrayList size should be equal to 2
         && s.charAt(al.get(0)) == goal.charAt(al.get(1) && s.charAt(al.get(1) == goal.charAt(al.get(0)),
         then return it else return false.
        */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class BuddyString {

    @Test
    public void test1(){
        String s1 = "ab";
        String s2="ba";
        System.out.println(buddyStrings(s1,s2));
    }
    @Test
    public void test2(){
        String s1 = "aa";
        String s2="aa";
        System.out.println(buddyStrings(s1,s2));
    }
    @Test
    public void test3(){
        String s1 = "ac";
        String s2="ac";
        System.out.println(buddyStrings(s1,s2));
    }
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        HashSet<Character> hs = new HashSet<Character>();
        if(s.equals(goal)){
            for(int i = 0; i < s.length(); i++)
                hs.add(s.charAt(i));
            if(hs.size() < s.length())
                return true;
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(s.length() == goal.length() && !s.equals(goal)){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != goal.charAt(i))
                    al.add(i);
            }
        if(al.size() == 2 && s.charAt(al.get(0)) == goal.charAt(al.get(1)) &&
                s.charAt(al.get(1)) == goal.charAt(al.get(0)))
                return true;
        }
        return false;
    }
}
