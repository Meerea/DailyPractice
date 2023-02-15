package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLengthWithoutReChars {

    @Test
    public void test1(){
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
@Test
public void test2(){

}
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){

            if(!set.contains(s.charAt(right))){ //abcabcbb
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);

            }else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));left++;
                set.add(s.charAt(right));
            }

        }
        return maxLength;
    }
}



