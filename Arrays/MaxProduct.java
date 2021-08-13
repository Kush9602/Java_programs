//  we have to find the maximum contiguous product sub-array
public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = { -6, 1, 3, 5, 1 };

        System.out.println("Max contiguous product: " + maxProduct(arr));
    }

    // Brute Force method
    // Time complexity = O(N^2)
    static int maxProductBF(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int product = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                product *= arr[j];
                max = Math.max(product, max);
            }
        }

        return max;
    }

    // Time complexity = O(n)
    private static int maxProduct(int[] arr) {
        int minVal = arr[0];
        int maxVal = arr[0];

        int maxProduct = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < 0) {
                int temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }

            maxVal = Math.max(arr[i], maxVal * arr[i]);
            minVal = Math.min(arr[i], minVal * arr[i]);

            maxProduct = Math.max(maxProduct, maxVal);
        }

        return maxProduct;
    }
}
