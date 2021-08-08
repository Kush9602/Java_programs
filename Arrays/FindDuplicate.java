import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 4, 5 };

        findDuplicate(arr);
    }

    // Time complexity is O(N)
    // Space complexity id O(N)
    static void findDuplicate_1(int[] arr) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int num = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (!hs.containsKey(arr[i]))
                hs.put(arr[i], 1);
            else
                System.out.println(arr[i]);
        }
    }

    // Time complexity is O(N)
    // Space complexity id O(1)
    // not work if a number repeats more than twice
    static void findDuplicate_2(int[] arr) {
        int n = arr.length() - 1;
        int sum = (n * (n + 1)) / 2;
        int arrSum = 0;

        for(int i = 0; i < arr.legth; i++)
            arrSum += arr[i];

        System.out.println(Math.abs(sum - arrSum)));
    }

}
