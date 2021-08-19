// we have to minimum number of merge operations required to make the given array a ‘Palindrome’.
// The only allowed operation is merging (of two adjacent elements)

public class MinOperToMakePalindrome {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 4, 5, 9, 1 };

        System.out.println(minOperations(arr));
    }

    static int minOperations(int[] arr) {
        if (arr.length == 1)
            return 0;

        int start = 0;
        int end = arr.length - 1;
        int count = 0;

        while (start < end) {
            if (arr[start] == arr[end]) {
                start++;
                end--;
            } else if (arr[start] < arr[end]) {
                arr[start + 1] = arr[start] + arr[start + 1];
                count++;
                start++;
            } else {
                arr[end - 1] = arr[end] + arr[end - 1];
                end--;
                count++;
            }
        }

        return count;
    }

}
