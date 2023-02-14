package DSAToSolve;

import org.junit.jupiter.api.Test;

/* TestData 1 - int[] arr = {9,5,12,10,14,3,10},int pivot=10
        TestData 2 - int[] arr ={4,3,2,1},int pivot=2

        Pseudocode
        Create a new array and 2 pointers  left =0 and right = nums.length-1
        Traverse a loop from 0 till length-1
        Check if elements < pivot then in new array and increment left
        Check from backward direction and add elements in new array if elements > pivot and decrement right
        A loop traversing while left <= right, add pivot in the array
        return new array
        */

public class PivotArray {
@Test
    public void test1(){
        int[] arr = {9,5,12,10,14,3,10};
        int pivot=10;
        pivotArray(arr,pivot);

    }

    public int[] pivotArray(int[] nums, int pivot) {

        int [] arr = new int[nums.length];
        int left=0, right=nums.length-1;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot)
                arr[left++]=nums[i];

            if(nums[nums.length-i-1]>pivot){
                arr[right--]=nums[nums.length-i-1];
            }
        }
        while(left <= right){
            arr[left++]=pivot;
        }
        return arr;
    }
}


