public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4, 0, 1, 3, 2 };
        System.out.println(trappedWater(arr));
    }

    // Time complexity is O(n)
    static int trappedWater(int[] arr) {
        int water = 0;

        // perpared left sub array for max height from left to right
        int[] left = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
            left[i] = Math.max(left[i - 1], arr[i]);

        // perpared right sub array for max height from right to left
        int[] right = new int[arr.length];
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        // formula to calculate trapped rain water at every index
        for (int i = 0; i < arr.length; i++)
            water += (Math.min(left[i], right[i]) - arr[i]);

        return water;
    }
}
