package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class FairCandyShare {

    @Test
    public void test1(){
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        System.out.println(fairCandy(aliceSizes,bobSizes));
    }


    public int[] fairCandy(int[] aliceSizes,int[] bobSizes){
    int sumA = 0, sumB = 0;
    Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < aliceSizes.length; i++) {
        sumA += aliceSizes[i];
        setA.add(aliceSizes[i]);
    }
        for (int i = 0; i < bobSizes.length; i++)
    sumB += bobSizes[i];
    int dif = (sumA - sumB) / 2;
        for (int i = 0; i < bobSizes.length; i++) {
        int targetA = bobSizes[i] + dif;
        if (setA.contains(targetA))
            return new int[]{targetA, bobSizes[i]};
    }
        return null;
}
}

