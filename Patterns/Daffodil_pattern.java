import java.util.Scanner;

public class Daffodil_pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();

        for (int i = n; i > 0; i--) {
            int temp = n;
            int temp1 = 1;
            for (int j = 1; j <= i * n; j++) {
                if (temp1 <= i) {
                    System.out.print(temp);
                    temp1++;
                } else {
                    temp--;
                    temp1 = 2;
                    System.out.print(temp);
                }
            }
            System.out.println();
        }
    }
}
