
//Given an array of integers and a number x, find the smallest subarray with sum greater than the given value. 
public class GreaterSumSubarray {
    public static void main(String[] args) {
        int[] arr = { 1, 10, 5, 2, 7 };
        int n = arr.length;
        int x = 9;

        System.out.println(minSubarray(arr, n, x));
    }

    static int minSubarray(int[] arr, int n, int x) {
        int count = 0;
        int minCount = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;

        outer: for (int i = 0; i < n; i++) {
            sum += arr[i];
            count++;
            while (sum > x) {
                if (sum - arr[start] > x) {
                    sum -= arr[start];
                    count--;
                    start++;
                    continue;
                }
                minCount = Math.min(count, minCount);
                // In case if it is the min possible solution
                if (minCount == 1)
                    return 1;
                continue outer;
            }
        }

        // In case if there is no solution
        if (minCount == Integer.MAX_VALUE)
            minCount = 0;

        return minCount;
    }

}
