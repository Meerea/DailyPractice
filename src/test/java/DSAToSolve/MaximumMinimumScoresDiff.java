package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/*
1.Sort Input array
2.Iterate the array by checking the condition difference of second element and first element
3.Use Math function to get the minimum difference
 */

public class MaximumMinimumScoresDiff {

    @Test
    public void test1(){
    int[] nums = {90};
    int k = 1;
    }
    @Test
    public void test2(){
    int[] nums = {9,4,1,7};
    int k = 2;
    }
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;
        Arrays.sort(nums);
        int i = 0, j = k - 1,
                min = Integer.MAX_VALUE;
        while (j < nums.length) {
            min = Math.min(min, nums[j++] - nums[i++]);
        }
        return min;
    }
}

