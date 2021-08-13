// we can only buy and sell atmost twice.

public class BuyAndSellStocks3 {
    public static void main(String[] args) {
        int[] price = { 10, 22, 5, 75, 65, 80 };
        int n = price.length;

        buyNsellDP(price, n);
    }

    // using Dynamic Programming
    // Time complexity = O(n) = Space Complexity
    static void buyNsellDP(int[] price, int n) {
        int[] dp = new int[n];
        int max = price[n - 1];
        int min = price[0];

        // moving backward and calculating the maximum
        for (int i = n - 2; i >= 0; i--) {
            if (price[i] > max)
                max = price[i];
            dp[i] = Math.max(dp[i + 1], max - price[i]);
        }

        // moving forward and calculating max from 0 to i and i to n
        for (int i = 1; i < n; i++) {
            if (price[i] < min)
                min = price[i];
            dp[i] = Math.max(dp[i - 1], dp[i] + (price[i] - min));
        }

        System.out.println(dp[n - 1]);

    }

}
