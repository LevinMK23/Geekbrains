package Olimp.IntegerAlg.prime;

import java.util.Scanner;

public class Chebishev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), co = 0;
        for (int i = n + 1; i < 2 * n; i++) {
            if(prime(i)) co++;
        }
        System.out.println(co);
    }

    private static boolean prime(int i) {
        for (int j = 2; j * j <= i ; j++) {
            if(i % j == 0) return false;
        }
        return true;
    }
}
