package Assignments;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

/*

TestData 1 - nums={3,1,2,4}
TestData 2 - nums={3,1,4}
TestData 1 - nums={0}

PseudoCode:
1.Declare index index pointer variables as left=0,right=length-1 and temp=0
2.Using while loop traverse through input array until its length and check condition if elements in left & right
is even or odd using '%' operator
3.If odd & even swap and increment both L++ & R++
5.If both odd then increment left++,right++
6.else increment left++
 */
public class SortArrayByParity {

    @Test
    public void test1(){
        int[] nums = {3,1,2,4};
        sortArrayByParity(nums);
    }
    @Test
    public void test2(){
        int[] nums = {0};
        sortArrayByParity(nums);
    }

    public int[] sortArrayByParity(int[] nums) {
        int left =0, right=nums.length-1, temp=0;
        while(left<right){
            if (nums[left]%2!=0 && nums[right]%2==0) {
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
            else if(nums[left]%2==0 && nums[right]%2==0){
                left++;
            }
            else if(nums[left]%2!=0 && nums[right]%2!=0){
                right--;
            }
            else if (nums[left]%2==0 && nums[right]%2!=0){
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}

