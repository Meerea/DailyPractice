package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharsInAllStrings {

    @Test
    public void test1(){
        String[] words={"cat", "bat", "rat"};
        commonChars(words);
    }

    public List<String> commonChars(String[] words) {
        List<String> chars = new ArrayList<String>();
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i=0;i<words[0].length();i++){

            map.put(words[0].charAt(i), map.getOrDefault(words[0].charAt(i),0)+1);
        }
        for(int i=1;i<words.length;i++){
            Map<Character,Integer> tempmap = new HashMap<Character,Integer>();
            String tempStr=words[i];
            for(char ch:tempStr.toCharArray()){
                if(map.containsKey(ch)){
                    tempmap.put(ch, Math.min(map.get(ch),tempmap.getOrDefault(ch,0)+1));
                }
            }
            map=tempmap;
        }
        for(Map.Entry<Character,Integer> alphabets: map.entrySet()) {
            for (int i = 0; i < alphabets.getValue(); i++) {
                chars.add(alphabets.getKey() + "");
            }
        }
        return chars;

    }

}

