import java.util.*;

public class AntiSpiralTraversal {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        printAntiSpiral(arr);
    }

    static void printAntiSpiral(int[][] arr) {
        Stack s = new Stack();

        int top = 0;
        int down = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
        int direction = 0;

        // move in spiral and put every value in stack and then po stack and print
        while (left <= right && top <= down) {
            // moving from left to right
            if (direction == 0) {
                for (int i = left; i <= right; i++)
                    s.push(arr[top][i]);
                top += 1;
            }

            // moving from top to down
            else if (direction == 1) {
                for (int i = top; i <= down; i++)
                    s.push(arr[i][right]);
                right -= 1;
            }

            // moving from right to left
            else if (direction == 2) {
                for (int i = right; i >= left; i--)
                    s.push(arr[down][i]);
                down -= 1;
            }

            // moving from down to up
            else if (direction == 3) {
                for (int i = down; i >= top; i--)
                    s.push(arr[i][left]);
                left += 1;
            }

            direction = (direction + 1) % 4;
        }

        while (!s.isEmpty())
            System.out.print(s.pop() + " ");

    }

}
