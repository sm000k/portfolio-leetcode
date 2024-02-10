package example.leetcode;

import java.util.Arrays;
// czas realizacji 50 minut
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToBuySell {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentProfit = 0;
        int currentleastprice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (currentleastprice > price) {
                currentleastprice = price;
            }
            currentProfit = price - currentleastprice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }

    static void unitTestMaxProfit(int[] input, int expected) {
        System.out.print(" input = " + Arrays.toString(input));
        System.out.print(" expected = " + expected);
        System.out.println(" result = " + (maxProfit(input) == expected ? "true" : "false"));
    }


    public static void main(String[] args) {
        unitTestMaxProfit(new int[]{7, 1, 5, 3, 6, 4}, 5);
        unitTestMaxProfit(new int[]{7, 6, 4, 3, 1}, 0);
        unitTestMaxProfit(new int[]{7, 4,9,3,5}, 5);
    }
}
