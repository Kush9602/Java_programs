public class RotationCount {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        int index = getRotationIndex(arr, 0, arr.length - 1);
        System.out.println((arr.length - index) % arr.length);
    }

    static int getRotationIndex(int[] arr, int low, int high) {
        if (high < low)
            return 0;

        if (high == low)
            return low;

        int mid = low + (high + low) / 2;

        if (mid < high && arr[mid + 1] < arr[mid])
            return mid + 1;

        else if (mid > low && arr[mid - 1] > arr[mid])
            return mid;

        else if (arr[high] > arr[mid])
            return getRotationIndex(arr, low, mid - 1);

        return getRotationIndex(arr, mid + 1, high);
    }
}
