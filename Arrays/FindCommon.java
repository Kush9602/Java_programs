import java.io.*;
import java.util.*;

public class FindCommon {
    public static void main(String[] args) throws IOException {
        String array1[] = getStringArray();
        String array2[] = getStringArray();
        String array3[] = getStringArray();

        getCommonElements(array1, array2, array3);

        // int[] A = { 1, 1, 1 };
        // int[] B = { 1, 1, 1 };
        // int[] C = { 1, 1, 1 };
        // commonElements(A, B, C, 3, 3, 3);

    }

    // Time Complexity = O(n1 + n2 + n3)
    static void commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here
        ArrayList<Integer> common = new ArrayList<>();

        int p1 = 0, p2 = 0, p3 = 0;

        while (p1 < n1 && p2 < n2 && p3 < n3) {
            if (A[p1] == B[p2]) {
                if (A[p1] == C[p3] && !common.contains(A[p1])) {
                    common.add(A[p1]);
                    p1++;
                    p2++;
                    p3++;
                } else if (A[p1] > C[p3])
                    p3++;
                else {
                    p1++;
                    p2++;
                }
            } else if (A[p1] > B[p2])
                p2++;
            else
                p1++;
        }

        System.out.println(common);
    }

    static String[] getStringArray() throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the array in a single line: ");
        String str = scan.readLine();
        String array[] = str.split(",");

        return array;
    }

    // time complexity = O(n^2)
    // not even correct... when all the elements are same
    static void getCommonElements(String arr1[], String arr2[], String arr3[]) {
        String minArr[] = (arr1.length > arr2.length) ? ((arr2.length > arr3.length) ? arr3 : arr2)
                : ((arr1.length > arr3.length) ? arr3 : arr1);

        System.out.print("Common element are: ");
        for (int i = 0; i < minArr.length; i++) {
            int f1 = 0, f2 = 0, f3 = 0;
            for (int j = 0; j < arr1.length; j++) {
                // System.out.println(arr1[j] + " " + minArr[i]);
                if (arr1[j].equals(minArr[i]))
                    f1 = 1;
            }

            for (int k = 0; k < arr2.length; k++) {
                if (arr2[k].equals(minArr[i]))
                    f2 = 1;
            }

            for (int x = 0; x < arr3.length; x++) {
                if (arr3[x].equals(minArr[i]))
                    f3 = 1;
            }

            // System.out.println(f1 + " " + f2 + "" + f3);
            if (f1 == 1 && f2 == 1 && f3 == 1)
                System.out.print(minArr[i] + " ");
        }
    }
}
