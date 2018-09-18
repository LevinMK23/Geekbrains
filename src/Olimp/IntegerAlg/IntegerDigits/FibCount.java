package Olimp.IntegerAlg.IntegerDigits;

import java.util.Scanner;

public class FibCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a = 0, b = 1, c = 0, co = 1;
        long [] f = new long[100];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < 100; i++) {
            f[i] = (f[i-1] + f[i-2]) % 10000000000L;
            if(f[i] == n){
                System.out.println(1);
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
