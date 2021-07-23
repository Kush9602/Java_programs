public class SpiralTraversal {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        printSpiral(arr);
    }

    static void printSpiral(int[][] arr) {
        int top = 0;
        int down = arr.length - 1;
        int right = arr[0].length - 1;
        int left = 0;
        int direction = 0;

        while (down >= top && right >= left) {
            // for moving left to right
            if (direction == 0) {
                for (int i = left; i <= right; i++)
                    System.out.print(arr[top][i] + " ");
                top += 1;
            }

            // for moving top to down
            else if (direction == 1) {
                for (int i = top; i <= down; i++)
                    System.out.print(arr[i][right] + " ");
                right -= 1;
            }

            // moving from right to left
            else if (direction == 2) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[down][i] + " ");
                down -= 1;
            }

            // moving from down to up
            else if (direction == 3) {
                for (int i = down; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left += 1;
            }

            direction = (direction + 1) % 4;
        }
    }
}