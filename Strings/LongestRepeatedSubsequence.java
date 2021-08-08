public class LongestRepeatedSubsequence {
    public static void main(String[] args) {
        String str = "kushmaskush";

        longestSubsequence(str);
    }

    static void longestSubsequence(String str) {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (str.charAt(i - 1) == (str.charAt(j - 1))) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        System.out.println("Longest repeated subsequence is of length: " + max);

    }
}
