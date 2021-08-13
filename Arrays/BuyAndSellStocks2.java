
// we have to maximize profit...we can buy any number of time and sell any number of times...
// but we havw to sell previous stocks before buying new stocks.
import java.util.*;

public class BuyAndSellStocks2 {
    public static void main(String[] args) {
        int price[] = { 100, 180, 260, 310, 40, 500, 695 };
        int n = price.length;

        // maxProfit(price, n);
        buyNsell2(price, n);
    }

    // valley hill approach
    static void buyAndSell(int[] prices, int n) {
        int max = 0;

        for (int i = 1; i < n; i++) {
            int profit = prices[i] - prices[i - 1];
            if (profit > 0)
                max += profit;
        }

        System.out.println(max);
    }

    // Time complexity = O(n)
    static void maxProfit(int[] price, int n) {
        int minPrice = price[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (price[i] < price[i - 1]) {
                maxProfit += price[i - 1] - minPrice;
                minPrice = price[i];
            }
        }

        if (minPrice < price[n - 1])
            maxProfit += price[n - 1] - minPrice;

        System.out.println(maxProfit);
    }

    // gfg submission of buyAndSell problem
    static void buyNsell2(int[] A, int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        int buyAt = 0, sellAt;

        for (int i = 0; i < n - 1; i++) {
            if (A[i] > A[i + 1]) {
                sellAt = i;
                if (A[sellAt] - A[buyAt] > 0) {
                    ArrayList<Integer> a = new ArrayList<Integer>();
                    a.add(buyAt);
                    a.add(sellAt);
                    ans.add(a);
                }
                buyAt = i + 1;
            }
        }

        if (A[buyAt] < A[n - 1]) {
            ArrayList<Integer> a = new ArrayList<Integer>();
            a.add(buyAt);
            a.add(n - 1);
            ans.add(a);
        }

        System.out.println(ans);
    }

}
