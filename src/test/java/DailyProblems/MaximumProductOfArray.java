package DailyProblems;
/*
Given an integer array nums, find a subarray
that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
 */
/* Pseudocode
1.Declare maxProduct as Integer with min value and prod=1
2.Iterate through the array and multiply with prod,and check Math max condition of(maxProduct, prod)
 if in case product value becomes zero, reassign prod=1
3.Iterate array from last and multiply with prod,and check Math max condition of(maxProduct, prod)
 if in case product value becomes zero, reassign prod=1

 */

import org.junit.jupiter.api.Test;

public class MaximumProductOfArray {
    @Test
    public void test1(){
        int[] nums={2,3,-2,4};
        System.out.println(maxProduct(nums));

    }
    @Test
    public void test2(){
        int[] nums={0,2};
        System.out.println(maxProduct(nums));

    }
    public int maxProduct(int[] nums) {

        int maxProduct = Integer.MIN_VALUE;
        int prod = 1;

        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            maxProduct = Math.max(prod,maxProduct);
            if(prod==0){
                prod=1;
            }
        }
        prod=1;
        for(int j=nums.length-1;j>=0;j--){
            prod*=nums[j];
            maxProduct = Math.max(maxProduct,prod);
            if(prod==0){
                prod=1;
            }
        }   return maxProduct;
    }

}

