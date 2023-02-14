package DSAToSolve;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    @Test
    public void test1() {
        int rowIndex = 3;
        pascalTriangeSum(rowIndex);

    }

    private List pascalTriangeSum(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add(1);
            for (int j = i - 1; j > 0; j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }


        }
        return list;
    }
}