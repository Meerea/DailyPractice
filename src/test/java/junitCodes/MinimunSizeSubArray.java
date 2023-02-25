package junitCodes;

import org.junit.jupiter.api.Test;

public class MinimunSizeSubArray {
    @Test
    void name() {
    }

    public int minSubArrayLen( int[] nums, int s) {
        int output =Integer.MAX_VALUE, left =0 , right=0,maxValue=0;

        while(left<nums.length){
            if(maxValue<s && right<nums.length){
                maxValue += nums[right++];
            }else if(maxValue>=s){
                output = Math.min(output,right-left);
                maxValue -= nums[left++];
            }else
                break;
        }

        if(maxValue<s && output==Integer.MAX_VALUE)
            return 0;
        return output;
    }

}




