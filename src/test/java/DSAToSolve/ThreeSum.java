package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.*;



/*
1.Declare Set ,List and  sort input array
2.Iterate through input nums and check condition nms[i]+nums[j]+nums[k]==0
3.if equals add in set 
4.Retrun set as List and add in list 
/*
/*
public class ThreeSum {

    @Test
    public void test1(){
        int[] nums ={-1,0,1,2,-1,-4};
        threeSum(nums);
    }
    @Test
    public void test2(){
        int[] nums ={0,1,1};
        threeSum(nums);
    }
    @Test
    public void test3(){
        int[] nums ={0,0,0};
        threeSum(nums);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        if(nums.length==0) return new ArrayList<>();
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0) set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                if(sum<0) j++;
                if(sum>0) k--;

            }
        }
        return new ArrayList<>(set);

    }
}
*/