package Olimp.Dynamic.pack2;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class Game2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int [][][] d = new int[2][n][n];
        int [] sum1 = new int[n], sum2 = new int[n];
        int w1 = 0, ans = 0, ma1 = 0, ma2 = 0;
        d[0][0][1] = a[n-1];
        d[0][1][0] = a[0];
        for (int w = 0; w < 2; w++) {
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n && i + j < n; j++) {
                    d[w][i][j] = max(d[w][i - 1][j] + a[i], d[w][i][j - 1] + a[n - i - 1]);
                    if (d[w][i][j] > ma1 && w == 0) {
                        ma1 = d[w][i][j];
                    }
                    if (d[w][i][j] > ma2 && w == 1) {
                        ma2 = d[w][i][j];
                    }
                    w^=1;
                }
            }
        }
        if(ma1 > ma2){
            System.out.println(1);
        }
        else if(ma2 > ma1){
            System.out.println(2);
        }
        else System.out.println(0);
        showMatrix(d, n);
    }

    private static void showMatrix(int [][][] d, int n) {
        int w = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", d[w][i][j]);
            }
            System.out.println();
        }
        w = 1;
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", d[w][i][j]);
            }
            System.out.println();
        }
    }
}
