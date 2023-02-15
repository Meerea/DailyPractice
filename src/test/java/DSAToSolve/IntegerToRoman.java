package DSAToSolve;

/*
    1.Declare a hashmap and put all numbers with roman numbers
    2.Declare array and all numbers
    3.Iterate using for loop from 0 until array length
    4.if array num > given number, skip  else break
    5.Then add respective roman numerals to a new string and subtract num by array value
    6.return str
     */

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class IntegerToRoman {
     @Test
     public void test1(){
         int num = 3;
         System.out.println(intToRoman(num));
     }
    @Test
    public void test2(){
        int num = 1994;
        System.out.println(intToRoman(num));
    }
    @Test
    public void test3(){
        int num =58;
        System.out.println(intToRoman(num));
    }



    public String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");

        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String str = "";
        int i;

        while(num > 0){
            for(i=0;i<arr.length;i++){
                if(arr[i] > num){
                    continue;
                }
                else{
                    break;
                }
            }
            str += map.get(arr[i]);
            num -= arr[i];
        }
        return str;
    }
}

