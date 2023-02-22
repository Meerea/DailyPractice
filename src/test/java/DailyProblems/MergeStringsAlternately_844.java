package DailyProblems;
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
starting with word1. If a string is longer than the other, append the additional letters onto the end
of the merged string.

Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d
 */


import org.junit.jupiter.api.Test;

public class MergeStringsAlternately_844 {

    @Test
    public void test1() {
        String word1 = "ab", word2 = "pqrs";
        letterOfWordsAlternately(word1, word2);
    }

    private String letterOfWordsAlternately(String s1, String s2) {

        {
            String merged = "";
            int size = 0;
            int len1 = s1.length();
            int len2 = s2.length();
            int index = 0;
            if (len1 < len2)
                size = size + s1.length();
            else
                size = size + s2.length();

            for (int i = 0; i < size; i++) {
                merged = merged + s1.charAt(i) + s2.charAt(i);
                index++;
            }

            if (len1 != size) {
                while (index < len1) {
                    merged = merged + s1.charAt(index);
                    index++;

                }
            } else {
                while (index < len2) {
                    merged = merged + s2.charAt(index);
                    index++;
                }
            }
            System.out.println("merged string" + " " + merged);
            return merged;
        }
    }
}