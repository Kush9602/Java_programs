// Given an array A[ ] of positive integers of size N, where each value represents the number of 
// chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, 
// the task is to distribute chocolate packets among M students such that :
// 1. Each student gets exactly one packet.
// 2. The difference between maximum number of chocolates given to a student and minimum number of 
//    chocolates given to a student is minimum.

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 9, 56, 7, 9, 12 };
        int n = 8, m = 5;

        System.out.println(findMinDiff(arr, n, m));
    }

    static int findMinDiff(int[] arr, int n, int m) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            int start = arr[i];
            int end = arr[i + m - 1];
            minDiff = Math.min(minDiff, end - start);
        }

        return minDiff;
    }
}
