// Given an odd integer n, find a matrix of size n x n with following conditions:

// Each cell contains an integer from 1 and n (inclusive).
// No integer appears twice in the same x_cord or the same y_cordumn.
// All 1’s must be at every possible distance from the center of the matrix. The center of a n x n square is cell ((n-1)/2, (n-1)/2) for odd n.

import java.io.*;

public class ConstructUniqueMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n;
        // only accept odd dimentions
        while (true) {
            System.out.print("Enter odd dimention only: ");
            n = Integer.parseInt(read.readLine());
            if (n % 2 != 0)
                break;
        }

        int matrix[][] = new int[n][n];

        insertOne(matrix, n);
        printMatrix(matrix);
    }

    static void insertOne(int[][] arr, int n) {
        int left = 0, right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i][right] = 1;
                fillRemaining(arr, i, right, n);
                right--;
            } else {
                arr[i][left] = 1;
                fillRemaining(arr, i, left, n);
                left++;
            }
        }
    }

    static void fillRemaining(int[][] arr, int i, int j, int n) {
        // Initialize value to be filled
        int x = 2;

        // we start filling vertically
        // Fill all values below i as if i = 2 and j = 3 then fill {(3,3),(4,3)...(n-1,
        // 3)}
        for (int k = i + 1; k < n; k++)
            arr[k][j] = x++;

        // Fill all values above i
        // if i = 2 and j = 3 then fill {(1,3),.....(0,3)}
        for (int k = 0; k < i; k++)
            arr[k][j] = x++;
    }

    static void printMatrix(int[][] arr) {
        for (int x_cord = 0; x_cord < arr.length; x_cord++) {
            for (int y_cord = 0; y_cord < arr.length; y_cord++) {
                System.out.print(arr[x_cord][y_cord] + " ");
            }
            System.out.println();
        }
    }
}