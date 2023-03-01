package Assignments;

/*
TestData 1 - s = ["h","e","l","l","o"]
TestData 2- s=  ["H","a","n","n","a","h"]
TestData 3- s = ["g","o","o","d"]

Pseudocode:
1.Declare left=0, right = input length-1
2.Iterate using  while loop and swap the left & right
3.Return the string
 */


import org.junit.jupiter.api.Test;

public class ReverseString {
@Test
public void test1(){
    char[] s = {'H','a','n','n','a','h'};
    reverseString(s);
}
    @Test
    public void test2(){
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
    public void reverseString(char[] s) {
        int left=0,right = s.length-1;
        char temp;
        while(left<right){
            temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }

    }
}

