package Assignments;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SquareRootOfArrayEle {

    @Test
    public void test1(){
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    @Test
    public void test2(){
        int[] nums = {-7,-3,2,3,11};
        sortedSquares(nums);
    }
    public int[] sortedSquares(int[] nums) {
        int sqr=0,x=0;
        for(int i=0;i<nums.length;i++){
            sqr= nums[i]*nums[i];
            nums[x++]=sqr;
        }
        Arrays.sort(nums);
        return nums;
    }
}

