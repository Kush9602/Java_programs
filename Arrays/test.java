import java.util.*;

public class test {
    static String vovel = "aeiou";

    public static void main(String[] args) {
        int a[] = { 1, 4, 45, 6, 0, 19 };
        int n = 6, k = 51;
        // int k = 4;
        // maximixeSum(arr, k);
        // System.out.println(Integer.toString(200).length());
        // String str = "weak";
        // magicWord(str);
        int count = 0;
        int minCount = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;

        outer: for (int i = 0; i < n; i++) {
            sum += a[i];
            count++;
            while (sum > k) {
                if (sum - a[start] > k) {
                    sum -= a[start];
                    start++;
                    count--;
                    continue;
                }
                minCount = Math.min(count, minCount);
                count = 0;
                continue outer;
            }
        }

        System.out.println(minCount);
    }

    static void magicWord(String str) {
        String vov = "";
        for (int i = 0; i < str.length(); i++) {
            if (vovel.contains("" + str.charAt(i))) {
                vov += str.charAt(i);
            }
        }

        System.out.println(vov);
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
