package Olimp.STL;

import java.util.Scanner;

public class Bin {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int c = Integer.bitCount(n), a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for (int i = 2 * n - n / 2; i <= 2 * n; i++) {
            if(Integer.bitCount(i) == c) {
                a = i;
                break;
            }
        }
        for (int i = n + 1; i < 2 * n - n / 2; i++) {
            if(Integer.bitCount(i) == c) {
                b = i;
                break;
            }
        }
        System.out.println(Math.min(a, b));
    }
}
