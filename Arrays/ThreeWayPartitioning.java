public class ThreeWayPartitioning {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 1 };
        int a = 2, b = 4;

        threeWayPartitioning(arr, a, b);

        for (int i : arr)
            System.out.print(i + " ");
    }

    static void threeWayPartitioning(int[] arr, int a, int b) {
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i <= right; i++) {
            if (arr[i] < a) {
                swap(arr, left, i);
                left++;
            } else if (arr[i] > b) {
                swap(arr, right, i);
                right--;
                i--;
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
