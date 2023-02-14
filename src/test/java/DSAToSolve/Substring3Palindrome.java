package DSAToSolve;

/*Find substrings of length 3 which are palindrome
        input string - aBBBcdMOMkajleDAD
        output - BBB MOM DAD

        TestData 1 — aBBBcdMOMkajleDAD - BBB,MOM,DAD
        TestData 2- Asdsdba - sds, dsd
        TestData 3 -BSdsDba - Sds, dsD


        Pseusdocode: - Using sliding Window

        1.Declare Pointer =0 k=3 and Iterate using while loop until k length
        2.Declare List and  string variable word
        3.Check condition first char in equals last char
        If equals , add it in word and add the word to List
        If not equals , increment pointer , repeat the check condition
        4.Return the list

 */
/*
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Substring3Palindrome {
    @Test
    public void test1(){

    }
    private String findPalindrome(String s){

        int pointer =0, k=3;

List<String> list = new ArrayList<>();
//while(pointer<k){


for(int i=0;i<s.length();i++){
 String word= "";
}
    }


}
*/