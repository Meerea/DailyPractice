package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/*
TestData1-  nums={1,4,3,2}
Testdata2- nums={2,5,6,3,5}
Testdata3- nums={1,1}

Psuedocode
1.Sort given input Array and declare result
2.iterate through the array by incrementing i =i+2
3.Add the elements in result
 */


public class PartionSum {
    @Test
        public void test1() {
        int[] nums = {1,4,3,2};
        arrayPairSum(nums);
    }
    @Test
    public void test2() {
        int[] nums = {1,2};
        arrayPairSum(nums);
    }


    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;// 1,2,3,4,- 1,2,2,5,6,6
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}


