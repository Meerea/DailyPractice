package DSAToSolve;

import org.junit.jupiter.api.Test;

public class MergeStringsAlternatively {
    @Test
    public void test1(){
        String word1 = "abc", word2 = "pqr";
        mergeAlternately(word1,word2);
    }
    @Test
    public void test2() {

        String word1 = "ab", word2 = "pqrs";
        mergeAlternately(word1, word2);
    }

    public static String mergeAlternately(String s1,String s2)
    {
        String merged = "";
        int size= 0; int len1= s1.length();
        int len2=s2.length();
        int index=0;
        if(len1<len2)
            size = size+ s1.length();
        else
            size=size+ s2.length();

        for(int i=0;i<size;i++)
        {
            merged= merged + s1.charAt(i) + s2.charAt(i);
            index++;
        }

        if(len1!=size) {
            while (index < len1) {
                merged = merged + s1.charAt(index);
                index++;
            }
        }
        else {
            while (index < len2) {
                merged = merged + s2.charAt(index);
                index++;
            }
        }
        System.out.println("merged string"+" "+ merged);
        return merged;
    }
}

