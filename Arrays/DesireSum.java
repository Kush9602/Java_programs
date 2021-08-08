import java.io.*;
import java.util.*;

public class DesireSum {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of the array: ");
        int n = Integer.parseInt(in.readLine());
        int array[] = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = Integer.parseInt(in.readLine());

        System.out.print("Enter your desire sum of tuples: ");
        int sum = Integer.parseInt(in.readLine());

        // getPairCount(array, sum);
        optimizedSum(array, sum);

    }

    static void optimizedSum(int[] array, int sum) {
        HashMap<Integer, Integer> record = new HashMap<>();
        int count = 0;

        for (int num : array) {
            if (!record.containsKey(num))
                record.put(num, 1);
            else
                record.put(num, record.get(num) + 1);
        }

        for (int num : array) {
            if (record.get(sum - num) != null)
                count += record.get(sum - num);

            if (sum - num == num)
                count--;
        }

        System.out.println(count / 2);

    }

    // Complexity is n^2 but we can reduce the complexity using HASHMAP
    static void getPairCount(int arr[], int s) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == s)
                    count++;
            }
        }
        System.out.print("Total pairs are: " + count);

    }

}
