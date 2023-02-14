package DSAToSolve;

import org.junit.jupiter.api.Test;


/*TestData 1-int[] prices = {7, 1, 5, 3, 6, 4};
TestData 2 - int[] prices={3,1,4,2}
 */

public class BuyAndSell {
@Test
public void test1() {
    int[] prices = {7, 1, 5, 3, 6, 4};
    maxProfit(prices);
}

    public int maxProfit(int[] prices) {

        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int price = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            price = prices[i] - lsf;
            if(op < price){
                op = price;
            }
        }
        return op;
    }
}

