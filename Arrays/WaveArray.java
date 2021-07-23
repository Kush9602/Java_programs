import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = { 10, 90, 49, 2, 1, 5, 23 };

        // waveArray(arr);
        // System.out.println();
        optimumApproach(arr);
    }

    // Time complexity is O(nLog(n)) for sorting
    static void waveArray(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i += 2) {
            if (!(i + 1 >= arr.length)) {
                swap(arr, i, i + 1);
            }
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static void optimumApproach(int[] arr) {

        for (int i = 0; i < arr.length; i += 2) {
            if (i + 1 < arr.length && arr[i + 1] > arr[i])
                swap(arr, i, i + 1);

            if (i - 1 >= 0 && arr[i - 1] > arr[i])
                swap(arr, i, i - 1);
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
