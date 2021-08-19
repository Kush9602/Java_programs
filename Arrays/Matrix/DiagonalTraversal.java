public class DiagonalTraversal {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
        int m = 5, n = 4;
        printDiagonal(arr, m, n);
    }

    static void printDiagonal(int[][] arr, int m, int n) {
        int digSum = 0, x = 0, y = 0;

        for (int i = 0; i < m + n; i++) {
            x = (i < arr.length) ? i : (arr.length - 1);
            y = (i < arr.length) ? 0 : (digSum - x);
            while (x + y == digSum && x < m && y < n && x >= 0 && y >= 0) {
                System.out.print(arr[x][y] + " ");
                x--;
                y++;
            }
            System.out.println();
            digSum++;
        }
    }
}
