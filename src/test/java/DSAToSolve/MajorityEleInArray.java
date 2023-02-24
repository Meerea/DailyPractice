package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MajorityEleInArray {

    @Test
    public void test1(){
    int[] nums={3,2,3};
    majorityElement(nums);
    }
    @Test
    public void test2(){
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }


    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }


    public  Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            counts.put(nums[i],counts.getOrDefault(nums[i],0)+1);
        }
        return counts;
    }
}
