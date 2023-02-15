package DSAToSolve;

import java.util.HashSet;

/*
testdata 1 - s = "abccccdd",
testdata 2 - s = "a"
testdata 3 - s = " Aa"
testdata 4- s = " abA"
testdata 5 - s= " aaAA"

Pseudocde:
1.Declare hashset and int variable length =0
2.Iterate through for loop
3.Assign char variable to iterate each char
4.Add all the string chars in set , check if any char occurs again , add condition  length =length+2
 else add chars
5.Last check set size , if greater than zero , increment length
6.return the length

 */



public class LongestPanlindromePossible {

    public int longestPalindrome(String s) {
        int length = 0;

        HashSet<Character> set = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch= s.charAt(i);

            if (set.contains(ch)) {
                length += 2;
                set.remove(ch);
            }
            else {
                set.add(ch);
            }
        }
        if (set.size() > 0) {
            length ++;
        }
        return length;
    }
}

