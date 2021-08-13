import java.util.*;
import java.io.*;

public class LongLongFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter any number: ");
        int num = Integer.parseInt(read.readLine());

        longFactorial(num);
    }

    static void longFactorial(int num) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int size = 1, carry = 0;
        list.add(0, 1);

        int val = 2;

        while (val <= num) {
            for (int i = size - 1; i >= 0; i--) {
                int temp = list.get(i) * val + carry;
                list.set(i, temp % 10);
                carry = temp / 10;
            }

            while (carry != 0) {
                list.add(0, carry % 10);
                carry /= 10;
                size++;
            }
            val++;
        }

        for (int i : list)
            System.out.print(i);
    }
}
