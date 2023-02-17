package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticTriplets {
    @Test
    public void test1() {
        int[] nums={0,1,4,6,7,10};
        int diff=3;
        System.out.println(arithmeticTriplets(nums,diff));
    }

    @Test
    public void test2() {
        int[] nums={2,6,8,10 };
        int diff=2;
        System.out.println(arithmeticTriplets(nums,diff));
    }
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int num : nums) {
            if (set.contains(num - diff) && set.contains(num - 2 * diff)) {
                count = count + 1;
            }
            set.add(num);
        }
        return count;
    }
}

