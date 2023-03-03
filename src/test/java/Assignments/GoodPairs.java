package Assignments;

/*
TestData 1- nums = {1,2,3,1,1,3}
TestData 2-nums = {1,1,1,1}
TestData 3-nums={1,2,3}

Pseudocode:
1.Declare count variable as zero
2.Iterate using 2 for loops and check condition element of i & j equlas and i<j
    if equals increment count
3.Return the count value
 */

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GoodPairs {
    @Test

    public void test1(){
        int[] nums= {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));

    }
    @Test

    public void test2(){
        int[] nums= {1,1,1,1,1,1};
        System.out.println(numIdenticalPairs(nums));

    }
    @Test

    public void test3(){
        int[] nums= {1,2,3};
        System.out.println(numIdenticalPairs(nums));

    }
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
}

