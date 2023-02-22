package DailyProblems;
/*
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */

/*
Pseudocode
1.Use space " " and split to string[] array and iterate through array using while loop
2.Iterate and check condition if space,skip and append only words in new StringBuilder
3.Return the stringBuilder string
 */

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ReverseWordsInAString {

    @Test
    public void test1(){
       String s = "a good   example";
        ReverseWordsWithoutSpace(s);

    }

    private String ReverseWordsWithoutSpace(String s){
        String[] s1 = s.split(" ");
        int left=0,right=s1.length-1;
        String temp;
        for(int i=0;i<s1.length;i++){
            if(s1[i].equals(" ")){
                i++;
            }
            temp= s1[left];
            s1[left]= s1[right];
            s1[right]=temp;
        }
        System.out.println(Arrays.toString(s1));
        return String.valueOf(s1);

    }

}
