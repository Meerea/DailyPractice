package DSAToSolve;

import org.junit.jupiter.api.Test;

public class ReversePrefixWord {
    @Test
    public void test1(){
        String word ="abcdefd";
        char ch ='d';
        System.out.println(reversePrefix(word,ch));
    }

    public String reversePrefix(String word, char ch) {

        int left = 0, index=0;
        char temp;
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == ch) {
                index = i;
                break;
            }
        }
        if (index != 0) {
            while (left < index) {//abcdefd
                temp = letters[left];
                letters[left] = letters[index];
                letters[index] = temp;
                left++;
                index--;
            }
            return String.valueOf(letters);
        }
        return String.valueOf(letters);
    }

}

