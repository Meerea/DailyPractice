package Assignments;

import org.junit.jupiter.api.Test;

/*
TestData1 - String s= "ababa";
TestData2 -Sting s="abb";

Pseudocode:
1.Declare left=0, right =string length -1;
2.Iterate using while loop and check condition, to remove palindromic sequence
    not a palindrome as left not equals right and increment left & decrement right
    return 2
3.else return 1

 */

public class RemovePlaindromicSubsequence {

    @Test
    public void test1(){
        String s= "ababa";
        System.out.println(removePalindromeSub(s));
    }
    @Test
    public void test2(){
        String s= "abb";
        System.out.println(removePalindromeSub(s));
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

