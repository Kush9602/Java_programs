// [1,2,3,-1,-2,-3] => [-1,1,-2,2,-3,3]

public class RearrangeArray {
    public static void main(String[] args) {

        ArrayClasses ob = new ArrayClasses();
        int array[] = ob.getArray();

        int rearrange[] = reArrange(array);

        for (int i = 0; i < rearrange.length; i++)
            System.out.print(rearrange[i] + " ");
    }

    static int[] reArrange(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] < 0)
                    continue;
                int nextEle = nextInverse(arr, i);
                if (nextEle == -1)
                    return arr;
                rotateRight(arr, i, nextEle);
            } else {
                if (arr[i] >= 0)
                    continue;
                int nextEle = nextInverse(arr, i);
                if (nextEle == -1)
                    return arr;
                rotateRight(arr, i, nextEle);
            }
        }

        return arr;
    }

    static int nextInverse(int[] arr, int i) {
        if (arr[i] >= 0) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < 0)
                    return j;
            }
        } else {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= 0)
                    return j;
            }
        }
        return -1;
    }

    static void rotateRight(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }
}
