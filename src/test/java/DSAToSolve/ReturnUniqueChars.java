package DSAToSolve;

/*
compare to string and remove duplicates from it and return the unique character in console.
eg;s1="automation" s2="selenium" output:atoato
return the unique character of s1 & s2 by comparing both

TestData1 - s1="automation" s2="selenium" -- atoatosele
TestData2 - s1="test" s2="app"
TestData3 - s1="store" s2="stores"

Pseudocode
1.Declare Map and add string 1
2.Iterate map and check condition of map not contains chars and add to list1
3.Also get the map contains chars of string 2 and store in list2
4.Then iterate string 1 and add the chars which are not in list2 to list1
5.return list1

 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnUniqueChars {
    @Test
    public void test1(){
      String  s1="automation", s2="selenium";
        getuniqueChars(s1,s2);
    }



    public void getuniqueChars(String s1,String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) + 1);
        }
       /*  List<Character> list1 = new ArrayList<>();
         List<Character> list2 = new ArrayList<>();

             for(int i=0;i<s2.length();i++){
                 if(!map.containsKey(s2.charAt(i))){
                     list1.add(s2.charAt(i));
                 }
                 else {
                     list2.add()
                 }

             }
*/


    }

}
