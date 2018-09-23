package Olimp.Dynamic.pack1;

import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        k--;
        long [] d = new long[(int)n+1];
        d[0] = 1;
        d[1] = k;
        for (int i = 2; i < n+1; i++) {
            d[i] = d[i-1] * k + d[i-2] * k;
        }
        System.out.println(d[n]);
    }
}
