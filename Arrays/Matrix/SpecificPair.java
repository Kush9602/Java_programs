// Given an n x n matrix mat[n][n] of integers, find the maximum value of mat(c, d) – mat(a, b) 
// over all choices of indexes such that both c > a and d > b.
public class SpecificPair {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, -1, -4, -20 }, { -8, -3, 4, 2, 1 }, { 3, 8, 6, 1, 3 }, { -4, -1, 1, 7, -6 },
                { 0, -4, 10, -5, 1 } };

        specificPair(matrix);
    }

    // time complexity = O(n^2)
    static void specificPair(int[][] matrix) {
        int n = matrix.length;
        int[][] processed = new int[n][n];

        int maxValue = matrix[n - 1][n - 1];

        // filling last row
        for (int i = n - 1; i >= 0; i--) {
            if (matrix[n - 1][i] > maxValue)
                maxValue = matrix[n - 1][i];
            processed[n - 1][i] = maxValue;
        }

        // filling last col
        maxValue = matrix[n - 1][n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (matrix[i][n - 1] > maxValue)
                maxValue = matrix[i][n - 1];
            processed[i][n - 1] = maxValue;
        }

        maxValue = Integer.MIN_VALUE;
        // filling other blocks

        for (int row = n - 2; row >= 0; row--) {
            for (int col = n - 2; col >= 0; col--) {
                if (processed[row + 1][col + 1] - matrix[row][col] > maxValue)
                    maxValue = processed[row + 1][col + 1] - matrix[row][col];

                processed[row][col] = Math.max(matrix[row][col],
                        Math.max(processed[row + 1][col], processed[row][col + 1]));
            }
        }

        System.out.println(maxValue);
    }
}
