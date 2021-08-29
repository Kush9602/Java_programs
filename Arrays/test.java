import java.util.*;

public class test {
    static String vovel = "aeiou";

    public static void main(String[] args) {
        // int a[] = { 1, 4, 45, 6, 0, 19 };
        // int n = 6, k = 51;
        // // int k = 4;
        // // maximixeSum(arr, k);
        // // System.out.println(Integer.toString(200).length());
        // // String str = "weak";
        // // magicWord(str);

        String str = "abs asd  assfda    sddsfad";
        int max = Integer.MIN_VALUE;

        String[] arr = str.split(" ");

        for (String str1 : arr)
            max = Math.max(max, str1.length());

        System.out.println(max);
    }

    static void magicWord(String str) {
        String vov = "";
        for (int i = 0; i < str.length(); i++) {
            if (vovel.contains("" + str.charAt(i))) {
                vov += str.charAt(i);
            }
        }

        System.out.println(vov);
    }

    static void maximixeSum(int[] arr, int k) {
        Arrays.sort(arr);
        // -8 -4 -3 -3 3 3 7 8
        int sum = 0, last = arr.length - 1;
        if (last == 0 && k == 1) {
            sum += arr[0];
            System.out.println(sum);
            return;
        }

        while (last > 0 && k > 0 && arr[last] >= 0) {
            sum += arr[last];
            System.out.println(sum + " " + last + " " + k);
            if (arr[last - 1] != arr[last])
                k--;
            last--;
        }
        System.out.println(sum);
    }
}
