import java.util.Arrays;

public class MinimizeHeight {
    public static void main(String[] args) {
        int[] arr = { 1, 10, 14, 14, 14, 15 };
        int k = 6;
        System.out.println(MinimizeHeight(arr, 6, k));
    }

    static int MinimizeHeight(int[] arr, int n, int k) {
        if (n == 1)
            return 0;

        Arrays.sort(arr);

        int small = arr[0];
        int large = arr[n - 1];

        // initial minimun difference
        int minDiff = large - small;

        large -= k;
        small += k;

        if (small > large) {
            int temp = large;
            small = large;
            large = temp;
        }

        // traverse middle elements
        for (int i = 0; i < n - 1; i++) {
            int sum = arr[i] + k;
            int diff = arr[i] - k;

            if (diff >= small || sum <= large)
                continue;

            if (large - diff <= sum - small)
                small = diff;
            else
                large = sum;
        }

        return Math.abs(Math.min(minDiff, large - small));
    }
}
