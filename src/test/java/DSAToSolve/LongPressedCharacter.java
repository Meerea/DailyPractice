package DSAToSolve;

import org.junit.jupiter.api.Test;

/*
TestData 1 - name = "alex", typed = "aaleex"
        TestData 2- name = "alex", typed = "leexaa”
        TestData 3-name = "alex", typed = “test”
        TestData 4 - name = "alex", typed = "aaeex”

     Two pointer algorithm
 Pseudocode:
 1.Declare left =0,start from string 1 and right =0 start from string 2, char variable temp
 2.Iterate through the string1 and string 2 and check condition left == right
 and store string 1 left char in temp
    if equals right++,left++
    if not equals, return false
 3.If first letter equals and check second char not equals check right== temp
    if equals increment only right
4.Iterate till length of string 2 - return true or false


 */

public class LongPressedCharacter {

    @Test
    public void test1(){
        String s="alex";
        String t="aalex";
        System.out.println(isCharacterLongPressed(s,t));
    }
    @Test
    public void test2(){
        String s="alex";
        String t="leexaa";
        System.out.println(isCharacterLongPressed(s,t));
    }
    @Test
    public void test3(){
        String s="alex";
        String t="test";
        System.out.println(isCharacterLongPressed(s,t));
    }
    @Test
    public void test4(){
        String s="alex";
        String t="aaeex";
        System.out.println(isCharacterLongPressed(s,t));
    }
    private boolean isCharacterLongPressed(String s,String t){
        int left=0,right=0;
        char temp=s.charAt(left);

        if(t.length()<s.length()) return false;
        while(right<t.length()){
            if(s.charAt(left)!=t.charAt(right)){
                return false;
            }
            else if(s.charAt(left) == t.charAt(right)){
                left++;
                right++;
            }
            else if(s.charAt(left)!=t.charAt(right)){
                if(t.charAt(right)== temp){
                    right++;
                    left++;
                    temp=s.charAt(left);
                }
            }
        }
        return true;
    }
}
