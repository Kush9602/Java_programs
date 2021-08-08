import java.util.*;

public class ZeroSum {
    public static void main(String[] args) {
        int[] arr = { 0, 4, -2, -2, 5, -4, 3 };

        System.out.println(zeroSum(arr, 0));
    }

    // Time complexity = O(n) = Space Complexity
    static boolean zeroSum_1(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        int cur_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            cur_sum += arr[i];

            // if sum already exist in the set then that means sum from that index to curr
            // index is 0.
            if (arr[i] == 0 || cur_sum == 0 || set.contains(cur_sum))
                return true;

            set.add(cur_sum);
        }
        return false;
    }

    // brute force appproach
    // time complexity = O(n^2)
    // we again optimize it.
    // Maintaining a pointer 'start = 0' which indicate from where we are counting
    // If curSum > sum then we subtract prev ele from start pointer
    // & increment start until curSum < sum and start < i - 1
    // (only applicable if there is no -ve element)
    static boolean zeroSum(int[] arr, int sum) {
        int curSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            curSum = arr[i];
            if (arr[i] == 0)
                return true;

            for (int j = i + 1; j < arr.length; j++) {
                if (curSum == sum)
                    return true; // from i to j
                curSum += arr[j];
            }
        }

        return false;
    }

}
