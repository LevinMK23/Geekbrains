package Olimp.IntegerAlg.GCD;

import java.util.Scanner;

public class BigNod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int ans = gcd(n, m);
        while(ans > 0){
            System.out.print("1");
            ans--;
        }
    }

    private static int gcd(int n, int m) {
        return m == 0 ? n : gcd(m, n % m);
    }
}
