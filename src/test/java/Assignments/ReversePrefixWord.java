package Assignments;

import org.junit.jupiter.api.Test;

/*
TestData 1- word = "xyxzxe", ch = "z"
TestData 2- word = "xyxzxe", ch = "z"
TesData 3 -word = "abcde", ch = "c"

Pseudocode:
1.Declare index =0 and iterate through word using for loop
2.Check condition given char equals,then that value as index value
3.Use substring method to reverse until the index of given word


*/

public class ReversePrefixWord {
    @Test
    public void test1(){
       String word = "abcdefd";
       char ch ='d';
        reversePrefix(word,ch);
    }
    @Test
    public void test2(){
        String word = "xyxzxe";
        char ch ='z';
        reversePrefix(word,ch);
    }
    public String reversePrefix(String word, char ch) {
        int index=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        word=word.substring(0,index+1);
        return word;
    }
}

