public class MinSteps {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 0, 1, 1 };

        System.out.println("Minimum steps are " + minSteps(arr, 0, 0));
    }

    static int minSteps(int[] arr, int index, int steps) {
        if (index >= arr.length - 1)
            return steps;

        if (arr[index] == 0) {
            if (index - 1 < 0)
                return -1;
            else
                return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;
        int step = Integer.MAX_VALUE;
        for (int i = index + arr[index]; i > index; i--) {
            step = minSteps(arr, i, steps + 1);
            min = Math.min(step, min);
        }

        if (min == Integer.MAX_VALUE)
            return -1;

        return min;
    }
}

// [1,3,4,6,2,0,2] -->
