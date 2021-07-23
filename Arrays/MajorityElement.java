import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 5, 2, 5, 5, 2, 5 };

        majorityElement(arr, 8);
    }

    // Moore's voting method
    // time complexity is O(n)
    static void optimizedMajorityElement(int[] arr) {
        int candidate = findCandidate(arr);

        if (isMajority(arr, candidate))
            System.out.println("Majority element is " + candidate);
        else
            System.out.println("No majority element");
    }

    static int findCandidate(int[] arr) {
        int count = 1, maj_index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[maj_index])
                count++;
            else
                count--;

            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }

        return arr[maj_index];
    }

    static boolean isMajority(int[] arr, int cand) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == cand) {
                count++;
                if (count > arr.length / 2)
                    return true;
            }
        }
        return false;
    }

    // Time complexity is n.Log(n)
    static void majorityElement(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 0;
        int curr = arr[0];
        boolean majFound = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == curr) {
                count++;
                if (count > n / 2) {
                    System.out.println("Majority element is " + arr[i] + " occurs " + count + " times.");
                    majFound = true;
                    break;
                }
            } else {
                curr = arr[i];
                count = 1;
            }
        }

        if (majFound == false)
            System.out.println("No majority element");
    }
}
