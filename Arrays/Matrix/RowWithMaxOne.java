// Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s. 

public class RowWithMaxOne {
    public static void main(String[] args) {
        int matrix[][] = { { 0, 0, 0, 0, 1 }, { 0, 0, 1, 1, 1 }, { 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 },
                { 1, 1, 1, 1, 1 } };

        // maxOne(matrix);
        rowWithMax1s(matrix);
    }

    // Time complexity = O(m+n)
    static void rowWithMax1s(int arr[][]) {
        int count = 0;
        int row = Integer.MAX_VALUE;
        int i = 0, j = arr[0].length - 1;

        while (i < arr.length && j >= 0) {
            if (arr[i][j] == 1) {
                count++;
                row = i;
                j--;
            } else
                i++;
        }
        if (row == Integer.MAX_VALUE) {
            System.out.println("No row with 1");
            return;
        }

        System.out.println("Row " + row + " with " + count + " one's");
    }

    // time complexity - O(n.log n)
    static void maxOne(int[][] arr) {
        int max = 0, row = 0;
        for (int i = 0; i < arr.length; i++) {
            // if first element is 1 then every element in that array is 1 so max no of 1
            // equal to length of that col
            if (arr[i][0] == 1) {
                System.out.println("Index of row with max element is " + i + " with " + arr.length + " one's");
                return;
            }
            int start = 0;
            int end = arr[i].length - 1;

            int one = oneInCol(arr[i], start, end);

            if (one > max) {
                max = one;
                row = i;
            }
        }

        System.out.println("Index of row with max element is " + row + " with " + max + " one's");
    }

    // time complexity - O(log n)
    static int oneInCol(int[] arr, int start, int end) {
        if (end == start + 1) {
            if (arr[start] == 1)
                return arr.length - start;
            else if (arr[end] == 1)
                return arr.length - end;
            else
                return 0;
        }

        double mid = Math.ceil((start + end) / 2);
        int ones = 0;

        if (arr[(int) mid] == 1)
            ones = oneInCol(arr, start, (start + end) / 2);
        else
            ones = oneInCol(arr, (start + end) / 2, end);

        return ones;
    }

}