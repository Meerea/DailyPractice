package DSAToSolve;

import org.junit.jupiter.api.Test;

public class RingsAndRodCount {

    @Test
    public void test1() {
        String rings = "B0R0G0R9R0B0G0";
        System.out.println(countPoints(rings));
    }


    public int countPoints(String rings) {
        char[] ch = rings.toCharArray();
        int[] b = new int[10];
        int[] g = new int[10];
        int[] r = new int[10];
        for (int i = 1; i < ch.length; i = i + 2) {
            if (ch[i - 1] == 'B') {
                b[ch[i] - '0']++;
            } else if (ch[i - 1] == 'G') {
                g[ch[i] - '0']++;
            } else {
                r[ch[i] - '0']++;
            }
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (g[i] > 0 && b[i] > 0 && r[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}

