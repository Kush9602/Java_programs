import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 11, 4, 10, 9, 2, 1 }; // O/p - 1 2 3 4 9 10 11 12

        // insertionSort(arr);
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // insertion sort
    static void insertionSort(int[] arr) {
        int sorted = 0;

        while (sorted < arr.length - 1) {
            int temp = sorted;
            while (temp >= 0 && arr[temp + 1] < arr[temp]) {
                swap(arr, temp + 1, temp);
                temp--;
            }
            sorted++;
        }
    }

    // Merge sort
    static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2)
            return;

        int mid = n / 2;

        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++)
            left[i] = arr[i];

        for (int i = 0; i < n - mid; i++)
            right[i] = arr[mid + i];

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    static void merge(int[] arr, int[] left, int[] right) {
        int nL = left.length;
        int nR = right.length;
        int leftPointer = 0, rightPointer = 0, arrPointer = 0;

        while (leftPointer < nL && rightPointer < nR) {
            if (left[leftPointer] > right[rightPointer])
                arr[arrPointer++] = right[rightPointer++];
            else
                arr[arrPointer++] = left[leftPointer++];
        }

        while (leftPointer < nL)
            arr[arrPointer++] = left[leftPointer++];

        while (rightPointer < nR)
            arr[arrPointer++] = left[rightPointer++];
    }

    static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
}
