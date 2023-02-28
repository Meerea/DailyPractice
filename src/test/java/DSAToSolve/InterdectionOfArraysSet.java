package DSAToSolve;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterdectionOfArraysSet {

    @Test
    public void test1(){
    int[] nums1 = {1,2,2,1};
    int[] nums2 = {2,2};
        intersection(nums1,nums2);

    }
    @Test
    public void test2(){
    int[] nums1 = {4,9,5};
    int[] nums2 = {9,4,9,8,4};
        intersection(nums1,nums2);

    }


    public int[] intersection(int[] nums1, int[] nums2) {
        int right = 0, left = 0, x = 0;
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                set.add(nums1[left]);
                left++;
                right++;
            } else if (nums1[left] < nums2[right]) {
                left++;
            } else if (nums1[left] > nums2[right]) {
                right++;
            }
        }
        int[] output = new int[set.size()];
        for (int i : set) {
            output[x++] = i;
        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}


