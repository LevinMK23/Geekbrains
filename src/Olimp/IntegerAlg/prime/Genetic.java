package Olimp.IntegerAlg.prime;

import java.util.Scanner;

public class Genetic {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt(), m = in.nextInt();
        long g = gcd(n, m);
        long ans = factor(n, g) + factor(m, g);
        System.out.println(ans);
    }

    private static long factor(long n, long g) {
        int co = 0;
        n /= g;
        for (int i = 2; i * i <= n; i++) {
            while(n % i == 0) {
                n /= i;
                co++;
            }
        }
        co += n > 1 ? 1 : 0;
        return co;
    }

    private static long gcd(long n, long m) {
        return m == 0 ? n : gcd(m, n % m);
    }
}
