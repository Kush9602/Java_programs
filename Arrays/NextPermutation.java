// e.g 123 -> 132 -> 213 -> 231 -> 312 -> 321
public class NextPermutation {
    public static void main(String[] args) {
        int[] num = { 3, 2, 1 };

        // reverse(num, 0);
        nextPermutation(num);

        for (int k = 0; k < num.length; k++)
            System.out.print(num[k] + " ");
    }

    // standard mathametical approach
    static int[] nextPermutation(int[] num) {
        int i, j;
        boolean flag = false;

        for (i = num.length - 1; i > 0; i--) {
            if (num[i] > num[i - 1]) {
                flag = true;
                break;
            }
        }

        // if it is the last permutation e.g - 321 (or reverse) then we just reverse it
        if (flag == false)
            return reverse(num, 0);

        for (j = num.length - 1; j > 0; j--) {
            if (num[j] > num[i - 1])
                break;
        }

        // swap i-1 and j
        swap(num, i - 1, j);

        return reverse(num, i);
    }

    static int[] reverse(int[] num, int start) {
        int end = num.length - 1;
        while (end > start) {
            swap(num, start, end);
            start++;
            end--;
        }
        return num;
    }

    static void swap(int[] num, int a, int b) {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }

}
