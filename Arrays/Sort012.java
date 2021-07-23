public class Sort012 {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0, 1, 2, 2, 0, 1 };
        sort012(arr, 9);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort012(int a[], int n) {
        int low = 0, mid = 0, high = n;
        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, mid, low);
                low++;
                mid++;
            } else if (a[mid] == 2) {
                swap(a, mid, high);
                high--;
            } else
                mid++;
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}