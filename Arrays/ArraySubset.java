
// we have to check if array2 is a subset of array1 or not.
import java.util.*;

public class ArraySubset {
    public static void main(String[] args) {
        int[] arr1 = { 10, 5, 2, 23, 19 };
        int[] arr2 = { 19, 5, 2 };

        System.out.println(isSubset(arr1, arr2));
    }

    // Time complexity = O(n) = Space Complexity
    // This solution doesn't work in case if number occur mumtiple times.
    // To overcome this we'll use HashMap
    static String isSubset(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int item : arr1)
            set.add(item);

        for (int item : arr2) {
            if (!set.contains(item))
                return "No";
        }

        return "Yes";
    }
}
