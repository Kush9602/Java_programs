import java.util.Scanner;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int arr[] = { 5, 5, 10, 8, -1, 16, -3, 14, -10, -10 };
        int k = 4;
        maximixeSum(arr, k);
    }

    static void maximixeSum(int[] arr, int k) {
        Arrays.sort(arr);
        // -8 -4 -3 -3 3 3 7 8
        int sum = 0, last = arr.length - 1;
        if (last == 0 && k == 1) {
            sum += arr[0];
            System.out.println(sum);
            return;
        }

        while (last > 0 && k > 0 && arr[last] >= 0) {
            sum += arr[last];
            System.out.println(sum + " " + last + " " + k);
            if (arr[last - 1] != arr[last])
                k--;
            last--;
        }
        System.out.println(sum);
    }
}
