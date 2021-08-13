
// we can only buy once and sell once.
public class BuyAndSellStocks1 {
    public static void main(String[] args) {
        int[] stocks = { 7, 1, 5, 3, 6, 4 };

        // maxProfit_bruteForce(stocks);
        // maxProfit_optimized1(stocks);
        maxProfit_optimized2(stocks);
    }

    // Time Complexity = O(n)
    // Space Complexity = O(1)
    static void maxProfit_optimized2(int[] stocks) {
        int minSoFar = stocks[0];
        int maxProfit = 0;

        for (int stock : stocks) {
            minSoFar = Math.min(minSoFar, stock);
            int profit = stock - minSoFar;
            maxProfit = Math.max(profit, maxProfit);
        }

        System.out.println(maxProfit);
    }

    // Time Complexity = Space Complexity = O(n)
    static void maxProfit_optimized1(int[] stocks) {
        int[] futureMaxPrize = new int[stocks.length];
        int maxprofit = 0;

        for (int i = stocks.length - 1; i >= 0; i--) {
            if (i == stocks.length - 1)
                futureMaxPrize[i] = stocks[i];
            else
                futureMaxPrize[i] = Math.max(stocks[i], futureMaxPrize[i + 1]);
        }

        for (int i = 0; i < stocks.length; i++) {
            int profit = futureMaxPrize[i] - stocks[i];
            maxprofit = Math.max(maxprofit, profit);
        }

        System.out.println(maxprofit);
    }

    // Brute Force approach
    // Time complexity = O(n^2)
    static void maxProfit_bruteForce(int[] stocks) {
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < stocks.length - 1; i++) {
            for (int j = i + 1; j < stocks.length; j++) {
                int diff = stocks[j] - stocks[i];
                maxProfit = Math.max(diff, maxProfit);
            }
        }

        System.out.println(maxProfit);
    }
}
