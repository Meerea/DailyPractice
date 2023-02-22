package DSAToSolve;

import org.junit.jupiter.api.Test;

public class ReverseWordsInString {
    @Test
    public void test1(){
        String s= "Let's take LeetCode contest";
        reverseWords(s);
    }
    @Test
    public void test2() {
     String s = "God Ding";
        reverseWords(s);
    }

    public String reverseWords(String s) {
        String[] allWords = s.split(" ");
        String result = "";
        for (int i = 0; i < allWords.length; i++) {
            char[] ch = allWords[i].toCharArray();
            int left = 0, right = ch.length - 1;
            char temp;
            while (left < right) {
                temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            StringBuilder str= new StringBuilder();
            for(int j=0;j<ch.length;j++){
                str.append(ch[j]);
            }
            result += str.toString()+" ";
        }
        return result.trim();
    }
}

