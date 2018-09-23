package Olimp.Dynamic.pack3;

import java.util.Arrays;
import java.util.Scanner;

public class Pow2 {
    public static void main(String[] args) {
         int n = new Scanner(System.in).nextInt();
         int pow_N = 10;
         int N = 1001;
         int [][] dp = new int[pow_N][N];

        for (int j = 0; j < N; ++j)
            dp[0][j] = 1;

        for (int i = 1; i < pow_N; ++i){
            for (int j = 0; j < N; ++j){
                int p = 1 << i;
                if (j < p){
                    dp[i][j] = dp[i-1][j];
                    continue;
                }
                dp[i][j] = 0;
                dp[i][j] += dp[i-1][j];
                if (j-p >= 0)
                    dp[i][j] += dp[i][j-p];
            }
        }
        System.out.println(dp[9][n]);
    }

    static long [][] tmp;

    private static long rec(int sum, int inc, int n) {
        if (sum == n){
            tmp[sum][inc] = 1;
            return tmp[sum][inc];
        }
        if(sum > n || inc > n) return 0;
        if(tmp[sum][inc] > 0) return tmp[sum][inc];
        tmp[sum][inc] = rec(sum + inc, inc, n) +
                        rec(sum, inc * 2, n);
        return tmp[sum][inc];

    }
}
