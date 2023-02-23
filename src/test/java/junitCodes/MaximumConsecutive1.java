package junitCodes;

import org.junit.jupiter.api.Test;

public class MaximumConsecutive1 {
    @Test
    void test1() {
        int[] num1 = {1,1,1,0,0,0,1,1,1,1,0};
    int k = 2;
        System.out.println(longestOnes(num1,k));
    }
    @Test
    void test2() {
        int[] num2={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(num2,k));
    }
    public int longestOnes(int[] nums, int k) {

        int zeroCount=0,start=0,res=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end] == 0) {
                zeroCount++;
            }
            while(zeroCount>k){
                if (nums[start]==0){
                    zeroCount--;
                }
                start++;
            }
            res=Math.max(res,end-start+1);
        }

        return res;
    }
}


