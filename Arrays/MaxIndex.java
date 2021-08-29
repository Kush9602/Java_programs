
// Given an array arr[], find the maximum j – i such that arr[j] > arr[i].
import java.util.*;

public class MaxIndex {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 1, 8, 9, 10, 4, 5, 6 };

        // maxIndexBF(arr);
        maxIndex(arr);
    }

    // Time complexity = O(n) = Spcace complexity
    static void maxIndex(int[] arr) {
        int[] minL = new int[arr.length];
        int[] maxR = new int[arr.length];

        minL[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
            minL[i] = arr[i] < minL[i - 1] ? arr[i] : minL[i - 1];

        maxR[maxR.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--)
            maxR[i] = arr[i] > maxR[i + 1] ? arr[i] : maxR[i + 1];

        int i = 0, j = 0;
        int maxDiff = -1;
        while (i < minL.length && j < maxR.length) {
            if (maxR[j] > minL[i]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else
                i++;
        }

        System.out.println(maxDiff);
    }

    // Brute Force
    // Time complexity = O(n^2)
    static void maxIndexBF(int[] arr) {
        int maxDiff = -1;

        outer: for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] >= arr[i]) {
                    maxDiff = Math.max(maxDiff, j - i);
                    continue outer;
                }
            }
        }

        System.out.println(maxDiff);
    }
}
