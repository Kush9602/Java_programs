// we have to find min swaps such that all the element <= K are together
public class KTogether {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 3 };
        int k = 3;

        System.out.println(minSwaps(arr, k));
    }

    static void minSwaps(int[] arr, int k) {
        int batch = 0;
        int not_batch = 0;
        int min_swaps = Integer.MAX_VALUE;

        // total no. of element that are less than or equals to K
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k)
                batch++;
        }

        // from 0 to k... all element that need a swap
        for (int i = 0; i < batch; i++) {
            if (arr[i] > k)
                not_batch++;
        }

        // start and end element of the current range
        int start = 0, end = batch - 1;

        while (end < n) {
            min_swaps = Math.min(min_swaps, not_batch);
            end++;
            if (end < n && arr[end] > k)
                not_batch++;
            if (start < n && arr[start] > k)
                not_batch--;
            start++;
        }

        if (min_swaps == Integer.MAX_VALUE)
            min_swaps = 0;

        return min_swaps;
    }
}