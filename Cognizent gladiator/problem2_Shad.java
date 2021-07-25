import java.io.*;

public class problem2_Shad {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());
        for (int i = 1; i <= size; i++) {
            String str[] = in.readLine().split(" ");
            int lb = Integer.parseInt(str[0]);
            int ub = Integer.parseInt(str[1]);
            primediff(lb, ub);
        }
    }

    static void primediff(int lb, int ub) {
        int i, max = 0, min = 0, count = 0;
        for (i = lb; i <= ub; i++) {
            int c = prime(i);
            if (c == 2) {
                if (count == 0) {
                    min = i;
                    max = i;
                    count++;
                } else
                    max = i;
            }
        }
        if (count == 0)
            System.out.println(-1);
        else
            System.out.println((max - min));
    }

    // return 2 if prime otherwise return -1
    static int prime(int n) {
        int c = 2;
        for (int i = 2; i < (int) Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                c = 0;
                return -1;
            }
        }
        return c;
    }
}
