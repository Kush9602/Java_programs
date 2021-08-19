public class MedianOf2SortedArray {
    public static void main(String[] args) {
        // int arr1[] = { 1, 12, 15, 26, 38 };
        // int arr2[] = { 2, 13, 17, 30, 45 };
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 6, 7, 8, 9, 10 };

        median(arr1, arr2, 5);
    }

    static void median(int[] arr1, int[] arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;

        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2[0];
                break;
            }

            else if (j == n) {
                m1 = m2;
                m2 = arr1[0];
                break;
            }

            if (arr1[i] <= arr2[j]) {
                m1 = m2;
                m2 = arr1[i];
                i++;
            } else {
                m1 = m2;
                m2 = arr2[j];
                j++;
            }
        }

        System.out.println((m1 + m2) / 2);
    }

}
