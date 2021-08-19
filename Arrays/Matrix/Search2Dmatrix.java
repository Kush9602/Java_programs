
public class Search2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix = { { -8, -7, -5, -3, -3, -1, 1 }, { 2, 2, 2, 3, 3, 5, 7 }, { 8, 9, 11, 11, 13, 15, 17 },
                { 18, 18, 18, 20, 20, 20, 21 }, { 23, 24, 26, 26, 26, 27, 27 }, { 28, 29, 29, 30, 32, 32, 34 } };

        // System.out.println(searchMatrix(matrix, 0));
        System.out.println(optimized(matrix, 26));
    }

    // Time Complexity = O(m+n)
    static boolean optimized(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0, j = col - 1;
        boolean found = false;

        while (i < row && j >= 0) {
            if (matrix[i][j] > target)
                j--;
            else if (matrix[i][j] < target)
                i++;
            else if (matrix[i][j] == target) {
                found = true;
                break;
            }
        }

        return found;
    }

    // n-rows and m-column
    // Time complexity = O(nLog(m))
    static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean found = false;

        for (int i = 0; i < row; i++) {
            int start = matrix[i][0];
            int end = matrix[i][col - 1];

            if (target <= end) {
                int sIndex = 0, eIndex = col - 1;

                while (sIndex < eIndex) {
                    int mid = sIndex + (sIndex + eIndex) / 2;
                    if (matrix[i][sIndex] == target || matrix[i][eIndex] == target)
                        return true;

                    if (sIndex + 1 == eIndex) {
                        if (matrix[i][sIndex] == target)
                            return true;
                        else if (matrix[i][eIndex] == target)
                            return true;
                        else
                            return false;
                    }

                    if (mid < col && matrix[i][mid] > target)
                        eIndex = mid - 1;
                    else if (mid < col && matrix[i][mid] < target) {
                        sIndex = mid + 1;
                        eIndex = col - 1;
                    } else if (mid < col && matrix[i][mid] == target)
                        return true;
                }
            }

        }

        return found;
    }
}
