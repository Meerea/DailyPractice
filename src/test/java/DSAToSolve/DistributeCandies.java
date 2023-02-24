package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    @Test
    public void test1(){
        int[] candyType = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
    @Test
    public void test2(){
        int[] candyType = {1,1,2,3};
        System.out.println(distributeCandies(candyType));
    }


    public int distributeCandies(int[] candyType) {
        Set<Integer> typeSet = new HashSet<>();
        int halfLength = candyType.length/2;

        for (int c : candyType) {
            if (typeSet.size() >= halfLength)
                return halfLength;
            typeSet.add(c);
        }
        return Math.min(typeSet.size(), halfLength);
    }
}
