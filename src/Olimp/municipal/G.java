package Olimp.municipal;

import java.math.BigInteger;
import java.util.Scanner;

public class G {

    static BigInteger [][] d;

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        d = new BigInteger[1001][1001];
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                d[i][j] = new BigInteger("0");
            }
        }
        System.out.println(f(n, 1));
    }

    static BigInteger f(int n, int k){
        if(n == 0) return new BigInteger("1");
        if(n < 0 || k > n) return new BigInteger("0");
        if(d[n][k].compareTo(BigInteger.ONE) > 0){
            return d[n][k];
        }
        d[n][k] = f(n-k, k).add(f(n, k+2));
        return d[n][k];
    }
}
