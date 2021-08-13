import java.util.*;

public class nkOccurance {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 2, 1, 2, 3, 3 };
        int n = 8, k = 4;

        nBYkOccurance(arr, n, k);
    }

    // Time Complexity = O(n) = Space Complexity
    static void nBYkOccurance(int[] arr, int n, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int item : arr) {
            if (!map.containsKey(item))
                map.put(item, 1);
            else {
                map.put(item, map.get(item) + 1);
            }
        }

        for (int occur : map.values()) {
            if (occur > n / k)
                count++;
        }

        // return count;
        System.out.println(count);
    }

}
