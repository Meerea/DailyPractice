package Assignments;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/*

TestData1- aliceSizes = {1,1}, bobSizes = {2,2}
TestData2-aliceSizes = {2}, bobSizes = {1,3}
TestData3-aliceSizes = {1,2}, bobSizes = {2,3}


Pseudocode:
1.Declare Set and add the array1 elements to it and add to get sum1
2.Iterate array2 and add all its elements
3.Get the difference of two sum and divide by 2
4.Iterate until array2 length and add the value of array2 elements & difference to a target variable
5.Check condition, if set contains target value, return the array of target value and array2 element
 */
public class FairCandy {
@Test
public void test1(){
    int[] aliceSizes = {1,1}, bobSizes = {2,2};
    System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
}
    @Test
    public void test2(){
        int[] aliceSizes = {2}, bobSizes = {1,3};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < aliceSizes.length; i++) {
            sumA += aliceSizes[i];
            setA.add(aliceSizes[i]);
        }
        for (int i = 0; i < bobSizes.length; i++)
            sumB += bobSizes[i];
        int dif = (sumA - sumB) / 2;
        for (int i = 0; i < bobSizes.length; i++) {
            int targetA = bobSizes[i] + dif;
            if (setA.contains(targetA))
                return new int[]{targetA, bobSizes[i]};
        }
        return null;
    }
}

