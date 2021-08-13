import java.util.*;

public class LongestSequence {
    public static void main(String[] args) {
        int arr[] = { 86, 41, 65, 89, 44, 19, 40, 129, 31, 117, 97, 171, 81, 75, 109, 127, 167, 56, 153, 186, 165, 106,
                83, 24, 128, 71, 132, 29, 103, 70, 168, 108, 115, 140, 149, 196, 123, 18, 4, 5, 46, 51, 121, 155, 179,
                88, 164, 28, 150, 193, 100, 34, 124, 114, 187, 143, 91, 27, 59, 136, 32, 151, 37, 7, 74, 58, 195, 35,
                11, 176, 4, 43, 163, 13, 138, 6, 104, 169, 183, 90, 99, 172 };

        // System.out.println(longestSequence(arr));
        System.out.println(longestSequence_1(arr));
    }

    // time complexity = O(N)
    private static int longestSequence_1(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        // adding array to the HashSet
        for (int item : arr)
            set.add(item);

        int maxSequence = 0;

        for (int i = 0; i < arr.length; i++) {
            // if element is the first element of the sequence then only follows
            // e.g for sequence 1 2 3 4 5 this will only work when element is 1
            if (!set.contains(arr[i] - 1)) {

                int j = arr[i];
                // count the max sequence present in set from starting element(i.e arr[i])
                while (set.contains(j))
                    j++;

                if (maxSequence < j - arr[i])
                    maxSequence = j - arr[i];
            }
        }

        return maxSequence;
    }

    // time complexity = O(n.log(N))
    private static int longestSequence(int[] arr) {
        int longestSequence = 1;
        int sequence = 1;
        Arrays.sort(arr); // O(n.log(n))
        // [32,33,34,35,36,41,42,43,44,56,92] after sorting

        for (int i = 0; i < arr.length - 1; i++) { // O(n)
            if (arr[i] + 1 == arr[i + 1])
                sequence++;
            else
                sequence = 1;
            longestSequence = Math.max(longestSequence, sequence);
        }

        return longestSequence;
    }
}
