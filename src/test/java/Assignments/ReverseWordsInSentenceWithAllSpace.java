package Assignments;

/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving
whitespace and initial word order.

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Input: s = "God Ding"
Output: "doG gniD"

TestData1 - s = "Let's take LeetCode contest"
TestData2 - s="God Ding"
TestData3- s="Goodday"

Pseudocode:
1.Declare String Array and add input sentence by split method using space and declare new string variable
2.Iterate using for loop till the length of string array and convert each word to char[] array each time inside loop
3.Declare left=0, right=char array length-1 and use while loop condition left less than right for char array
4.Then swap the left & right chars of the char array and do left++,right--
5.Add the reversed word in string variable and add space between words using if condition
    if word is not last word of string array add space in string variable
6.Return string variable

 */

import org.junit.jupiter.api.Test;

public class ReverseWordsInSentenceWithAllSpace {

    @Test
    public void test1(){
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWordsofSentence(s));
    }

    @Test
    public void test2(){
        String s = "Goodday";
        System.out.println(reverseWordsofSentence(s));
    }
    public String reverseWordsofSentence(String s){
    String[] wordsArray = s.split(" ");
    String res=" ";
        for(int i=0;i<wordsArray.length;i++) {
        char[] c = wordsArray[i].toCharArray();
        int last=c.length-1; int first=0;

        while(first<last) {
            char temp = c[first];
            c[first] = c[last];
            c[last] = temp;
            last--;first++;
        }
        res+= new String(c);
        if(i!=wordsArray.length-1) {
            res+=" ";
        }
    }
        return res;
}
}

