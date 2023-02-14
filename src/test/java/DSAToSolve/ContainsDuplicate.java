package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    @Test
    public void test1(){
        int[] nums1={1,2,3,1};
        int k=3;
        System.out.println(containsNearbyDuplicate(nums1,k));
    }

    @Test
    public void test2(){
        int[] nums1={1,0,1,1};
        int k=1;
        System.out.println(containsNearbyDuplicate(nums1,k));
    }
    @Test
    public void test3(){
        int[] nums1={1,2,3,1,2,3};
        int k=2;
        System.out.println(containsNearbyDuplicate(nums1,k));
    }
    private boolean containsNearbyDuplicate(int[] nums, int k){
    int temp2=0, x=0,temp=0,sum=0,temp1=0;
    Set<Integer> set = new HashSet<Integer>();
        for (int i=0;i<nums.length;i++){
        if(!set.contains(nums[i])){
            set.add(nums[i]);
        }
        else{
            temp =nums[i];
            temp2=i;
            while(x<temp2){
                if(nums[x]== temp){
                    temp1=x;
                }
                x++;
            }
            sum= Math.abs(temp1-temp2);
            if(sum<=k) return true;
        }

    }
        return false;
}
}


