import java.util.*;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int[] heights = { 0, 0, 0, 0, 1, 0, 1, 1, 1, 1 };

        System.out.print(largestRectangle(heights));
    }

    static int largestRectangle(int[] heights) {
        // keep track of left/right smaller elements
        Stack<Integer> stack = new Stack<Integer>();
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        int maxArea = Integer.MIN_VALUE;

        // fill left
        for (int i = 0; i < heights.length; i++) {
            if (stack.isEmpty()) {
                left[i] = 0;
            } else {
                while (!stack.isEmpty() && heights[(int) stack.peek()] >= heights[i])
                    stack.pop();
                left[i] = stack.isEmpty() ? 0 : (int) stack.peek() + 1;
            }

            stack.push(i);
        }

        // clearing the stack
        while (!stack.isEmpty())
            stack.pop();

        // fill right
        for (int i = heights.length - 1; i >= 0; i--) {
            if (stack.isEmpty())
                right[i] = heights.length - 1;
            else {
                while (!stack.isEmpty() && heights[(int) stack.peek()] >= heights[i])
                    stack.pop();
                right[i] = stack.isEmpty() ? heights.length - 1 : (int) stack.peek() - 1;
            }
            stack.push(i);
            // calculating the maximun height
            int width = right[i] - left[i] + 1;
            int height = heights[i];
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}
