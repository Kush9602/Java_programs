import java.io.*;

public class codeChefPattern {
    public static void main(String[] args) throws IOException {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int flag = 2;
        int j = 0;
        for (int i = 1; i <= n * 5; i++) {
            if (flag % 2 == 0)
                System.out.print(i + " ");
            else {
                System.out.print(j + " ");
                j--;
            }
            if (i % 5 == 0) {
                System.out.println();
                j = i + 5;
                flag++;
            }
        }
    }
}
