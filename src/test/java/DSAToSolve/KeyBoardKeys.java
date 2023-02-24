package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.*;

public class KeyBoardKeys {

    @Test
    public void test1(){
    String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(findWords(words));

    }
    @Test
    public void test2(){
        String[] words = {"adsdf","sfd"};
        System.out.println(findWords(words));

    }
    public String[] findWords(String[] words) {

        List<String> list = new ArrayList<>();
        Set<Character> first = new HashSet<>(Arrays.asList
                ('q','w','e','r','t','y','u','i','o','p'));
        Set<Character> second = new HashSet<>(Arrays.asList
                ('a','s','d','f','g','h','j','k','l'));
        Set<Character> third = new HashSet<>(Arrays.asList
                ('z','x','c','v','b','n','m'));

        for(int i=0; i<words.length; i++){
            int f=0, s=0, t=0;
            int goal=words[i].length();

            for(int j=0; j<goal; j++){
                char key=Character.toLowerCase( words[i].charAt(j) );

                if(first.contains(key)) f++;
                if(second.contains(key)) s++;
                if(third.contains(key)) t++;
            }
            if(f==goal || s==goal || t==goal){
                list.add(words[i]);
            }
        }
        String [] output = list.toArray(new String[0]);
        return output;
    }
}


