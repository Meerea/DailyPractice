package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

/*
/*Pseudocode
1.Declare int variable left=0,right=1, firstOcc=0, sum=0
2.Iterate using while loop , check condition element of left & right equals
   if equals do the sum and check sum lesser or equlas k - if equals - return true
3.Else do the get the firstOcc index value of same element of left and reassign
the left & right pointers values and do the same operation and return true/false basedon condition */



public class ContainsDuplicateIndices {

    @Test
    public void test1(){
     int[] nums = {1,2,3,1};
     int k = 3;
    }

    @Test
    public void test2(){
        int[] nums = {1,0,1,1};
        int k = 1;
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (k ==0) return false;
        Set<Integer> slidingWindow = new HashSet();
        for(int i = 0; i<nums.length; i++){
            if(slidingWindow.contains(nums[i])) return true;
            if(i >= k)
                slidingWindow.remove(nums[i - k]);
            slidingWindow.add(nums[i]);
        }
        return false;
    }
}

