// Sort two arrays without using extra space

public class SortArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 0, 2, 6, 8, 9 };

        merge(arr1, arr2, 4, 5);
        // swap(arr1, arr1, 1, 2);

        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");

        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
    }

    // gap method
    public static void merge(int arr1[], int arr2[], int n, int m) {
        int p1, p2;

        for (int gap = nextGap(m + n); gap > 0; gap = nextGap(gap)) {

            for (p1 = 0; p1 + gap < n; p1++) {
                if (arr1[p1] > arr1[p1 + gap])
                    swap(arr1, arr1, p1, p1 + gap);
            }

            for (p2 = gap > n ? gap - n : 0; p2 < m && p1 < n; p1++, p2++) {
                if (arr1[p1] > arr2[p2])
                    swap(arr1, arr2, p1, p2);
            }

            if (p2 < m) {
                for (p1 = 0; p2 < m; p1++, p2++) {
                    if (arr2[p1] > arr2[p2])
                        swap(arr2, arr2, p1, p2);
                }
            }
        }
    }

    static void swap(int[] arr1, int[] arr2, int a, int b) {
        int temp = arr1[a];
        arr1[a] = arr2[b];
        arr2[b] = temp;
    }

    static int nextGap(int gap) {
        if (gap <= 1)
            return 0;

        return gap / 2 + gap % 2;
    }
}
