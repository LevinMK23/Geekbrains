package Olimp.Dynamic.pack1;

import java.math.BigInteger;
import java.util.Scanner;

public class Bunny {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt(), n = in.nextInt();
        BigInteger[] d = new BigInteger[n+1];
        d[0] = BigInteger.ONE;
        for (int i = 1; i < n+1; i++) {
            d[i] = new BigInteger("0");
            for (int j = i; j >= 0; j--) {
                if(Math.abs(i - j) <= k)
                    d[i] = d[i].add(d[j]);
            }
        }
        System.out.println(d[n]);
    }
}
