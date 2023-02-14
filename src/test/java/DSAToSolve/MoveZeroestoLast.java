package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MoveZeroestoLast {
    @Test
    public void test1() {
        int[] nums = {0,1,0,3,12};
       System.out.println(Arrays.toString(moveZeroes(nums)));
        moveZeroes1(nums);

    }


    private int[] moveZeroes(int[] nums) {
        int left = 0, right = 1, temp = 0;
        while (right < nums.length) {
            if (nums[left] == 0 && nums[right] != 0) {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            } else if (nums[left] != 0 && nums[right] != 0) {
                left++;
                right++;
            } else if (nums[left] != 0 && nums[right] == 0) {
                left++;
            } else if (nums[left] == 0 && nums[right] == 0) {
                right++;
            }
        }
        return nums;
    }

    public int[] moveZeroes1(int[] nums) {
        int left = 0, right = 1, temp = 0;
        if (nums.length < 2) {
            System.out.println(Arrays.toString(nums));
        }
        while (right < nums.length) {
            if (nums[left] == 0 && nums[right] != 0) {///0,1,0,3,12
                temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            } else if (nums[left] != 0) {
                left++;
                right++;
            } else if (nums[right] == 0) {
                right++;
            }

        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}


