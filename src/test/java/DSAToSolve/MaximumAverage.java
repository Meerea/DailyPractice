package DSAToSolve;

import org.junit.jupiter.api.Test;

public class MaximumAverage {

    @Test
    public void test1(){
       int[] nums = {1,12,-5,-6,50,3};
       int k = 4;
        System.out.println(findMaxAverage(nums,k));
    }
    @Test
    public void test2(){
        int[] nums = {5};
        int k = 1;
        System.out.println(findMaxAverage(nums,k));
    }
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        int sum=0, pointer=0, x=0;
        while(pointer<k-1){
            sum+= nums[pointer];
            pointer++;
        }
        for(;pointer<nums.length;pointer++){
            sum+=nums[pointer];
            maxAvg= Math.max(maxAvg,((double)sum/k));
            sum-=nums[x];
            x++;
        }
        return maxAvg;
    }
}

