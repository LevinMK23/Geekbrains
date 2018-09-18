package Olimp.IntegerAlg.GCD;

import java.util.Scanner;

public class SimpleGCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        System.out.println(gcd(n, m));
    }

    private static int gcd(int n, int m) {
        return m == 0 ? n : gcd(m, n % m);
    }
}
