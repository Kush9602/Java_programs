public class InversionCount {

    static int inversions = 0;

    public static void main(String[] args) {
        int[] arr = { 1, 20, 6, 7, 5, 8, 11, 3 };

        // countInversion(arr);
        partition(arr);
        System.out.println(inversions);
    }

    // optimal approach is by using merge sort algorithm
    static void partition(int[] arr) {
        if (arr.length == 1)
            return;

        int n = arr.length;
        int mid = n / 2;

        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < left.length; i++)
            left[i] = arr[i];

        for (int i = 0; i < right.length; i++)
            right[i] = arr[i + mid];

        partition(left);
        partition(right);
        merge(arr, left, right);
    }

    static void merge(int[] arr, int[] left, int[] right) {
        int nL = left.length;
        int nR = right.length;
        int leftP = 0, rightP = 0, arrayP = 0;

        while (leftP < nL && rightP < nR) {
            if (left[leftP] < right[rightP])
                arr[arrayP++] = left[leftP++];
            else {
                arr[arrayP++] = right[rightP++];
                inversions += nL - leftP;
            }
        }

        while (leftP < nL)
            arr[arrayP++] = left[leftP++];

        while (rightP < nR)
            arr[arrayP++] = right[rightP++];
    }

    // Brute Force method
    // Complexity O(n^2)
    static void countInversion(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
        }

        System.out.println(count);
    }
}
