package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortedArray {

    @Test
    public void test1(){
     int[] nums1 = {0};
     int[] nums2 = {1};
     int m = 0,n = 1;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int L=m,R=0;
        if(nums1.length ==m+n) {
            for (int i=0;R < nums2.length;R++) {
                nums1[L++] = nums2[R];
            }
        }
        Arrays.sort(nums1);
    }
}

