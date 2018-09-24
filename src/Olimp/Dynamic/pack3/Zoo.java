package Olimp.Dynamic.pack3;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        if (n == 3){
            System.out.println(new BigInteger(String.valueOf(a[0]))
                    .multiply(new BigInteger(String.valueOf(a[1]))
                            .multiply(new BigInteger(String.valueOf(a[2])))));
            return;
        }
        BigInteger [][] c = new BigInteger[n + 1][4];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < 4; j++) {
                c[i][j] = new BigInteger("0");
            }
        }

        for (int i = 0; i <= n; i++) {
            c[i][0] = BigInteger.ONE;
            //System.out.print(c[i][0] + " ");
            for (int j = 1; j < i  && j < 4; j++) {
                c[i][j] = c[i-1][j-1].add(c[i-1][j]);
                //System.out.print(c[i][j] + " ");
            }
            //System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            c[i][0] = BigInteger.ONE;
            //System.out.print(c[i][0] + " ");
            for (int j = 1; j < n && j < 4; j++) {
                c[i][j] = c[i-1][j-1]
                        .multiply(new BigInteger(String.valueOf(a[i-1])))
                        .add(c[i-1][j]);
                //System.out.print(c[i][j] + " ");
            }
            //System.out.println();
        }
        System.out.println(c[n][3]);

    }
}
