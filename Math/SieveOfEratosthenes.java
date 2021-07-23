// This algo is used to calculate the prime numbers between 1 to n
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 100;

        sieveOfEratosthenes(n);
    }

    // Time complexity is n.log(log(n))
    static void sieveOfEratosthenes(int n) {
        // array start from 0 so we have to take prime to n+1 fro finding prime between
        // 1 to n
        int[] prime = new int[n + 1];

        // 1 means it's a prime, 0 means not prime
        // initially let say all are prime
        for (int i = 0; i < n + 1; i += 2)
            prime[i] = 1;

        prime[0] = 0;
        prime[1] = 0;

        for (int i = 3; i * i < n; i += 2) {
            if (prime[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }

        System.out.print(2 + " ");
        for (int i = 3; i < prime.length; i += 2) {
            if (prime[i] == 1)
                System.out.print(i + " ");
        }
    }
}
