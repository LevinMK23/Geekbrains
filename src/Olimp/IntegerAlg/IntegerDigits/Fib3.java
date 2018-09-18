package Olimp.IntegerAlg.IntegerDigits;

import java.util.Scanner;

public class Fib3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        long [] f = new long[Math.max(n, m) + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < Math.max(n, m) + 1; i++) {
            f[i] = (f[i-1] + f[i-2]) % 1000000000000000000L;
        }
        System.out.println(f[gcd(n, m)] % 1000000000);
    }

    private static int gcd(int n, int m) {
        return m == 0 ? n : gcd(m, n % m);
    }
}
