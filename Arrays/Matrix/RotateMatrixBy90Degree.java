public class RotateMatrixBy90Degree {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        // matrix = rotateMatrixBF(matrix);
        rotateOptimized(matrix);
        print(matrix);

    }

    // Time complexity = O(n^2)
    // Space Complexity = O(1)
    static void rotateOptimized(int[][] matrix) {
        int n = matrix.length;

        // first rotation
        // with respect to main diagonal
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Second rotation
        // with respect to middle column
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }

    }

    // Brute Force
    // Time complexity = O(n^2) = Space Complexity
    static int[][] rotateMatrixBF(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        int k = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[k][i];
                k--;
            }
            k = n - 1;
        }

        return ans;
    }

    static void print(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
