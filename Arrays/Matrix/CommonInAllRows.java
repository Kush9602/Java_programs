import java.util.*;

public class CommonInAllRows {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, 5 }, { 2, 3, 5, 8, 10 }, { 3, 5, 7, 9, 11 }, { 1, 3, 5, 7, 9 } };

        commonInAllRows(matrix);
    }

    // time complexity = O(n^2)
    static void commonInAllRows(int[][] matrix) {
        int n = matrix.length;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        // putting all the item of first col into hash map
        for (int item : matrix[0])
            hm.put(item, 1);

        for (int row = 1; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (hm.containsKey(matrix[row][col]) && hm.get(matrix[row][col]) == row) {
                    hm.put(matrix[row][col], hm.get(matrix[row][col]) + 1);

                    if (hm.get(matrix[row][col]) == n - 1)
                        System.out.print(matrix[row][col] + " ");
                }
            }
        }
        // System.out.println(hm);

    }
}
