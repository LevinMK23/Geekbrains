package Olimp.IntegerAlg.GCD;

import java.util.Scanner;

public class SimpleNOK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), m = in.nextLong();
        System.out.println(nok(n, m));
    }

    private static long gcd(long n, long m) {
        return m == 0 ? n : gcd(m, n % m);
    }

    private static long nok(long n, long m){
        return n * m / gcd(n, m);
    }
}
