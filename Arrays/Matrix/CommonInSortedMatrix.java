public class CommonInSortedMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, 5 }, { 2, 3, 5, 8, 10 }, { 3, 5, 7, 9, 11 }, { 1, 3, 5, 7, 9 } };

        commonInAllRows(matrix);
    }

    static void commonInAllRows(int[][] matrix) {
        // point at last index of every row
        int[] column = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++)
            column[i] = matrix[0].length - 1;

        int minRow = 0;
        while (column[minRow] >= 0) {
            // finding row with min element
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][column[i]] < matrix[minRow][column[minRow]])
                    minRow = i;
            }

            int count = 0;

            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][column[i]] > matrix[minRow][column[minRow]]) {
                    if (column[i] == 0)
                        return;

                    column[i] -= 1;
                } else {
                    count++;
                    minRow = column[i] < column[minRow] ? i : minRow;
                }

                if (count == matrix.length) {
                    System.out.print(matrix[minRow][column[minRow]] + " ");
                    column[minRow]--;
                }
            }
        }
    }
}
