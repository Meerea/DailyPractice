package Assignments;

import org.junit.jupiter.api.Test;

/*
TestData 1- words = {"abc", "car", "ada", "racecar", "cool"};
TestData 2-words = {"notapalindrome", "racecar"};
TestData 3-words = {"abc"};

Pseudocode:
1.Declare string variable for output
2.Iterate string array using for loop until length
3.Convert each word to char array and check condition of left =0, right =length-1
    if left equals right - increment left++,right--
    else break loop, to check next word in string array
 */

public class FirstPalindromeWord {

        @Test
        public void test1() {
            String[] words = {"abc", "car", "ada", "racecar", "cool"};
            firstPalindrome(words);
        }

        @Test
        public void test2() {
            String[] words = {"notapalindrome", "racecar"};
            firstPalindrome(words);
        }

        private String firstPalindrome(String[] words) {
            String output1 = " ";
            for (int i = 0; i < words.length; i++) {
                char[] ch = words[i].toCharArray();
                int left = 0, right = ch.length - 1;
                while (left < right) {
                    if (ch[left] == ch[right]) {
                        String output = String.valueOf(ch);
                        System.out.println(output);
                        return output;
                    }
                    break;
                }
            }
            return output1;
        }
    }


