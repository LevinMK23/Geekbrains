package Olimp.Dynamic.pack2;

import java.util.Scanner;
import static java.lang.Math.*;

public class LongestIncSub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n + 1],
                d = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            a[i] = in.nextInt();
            d[i] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                if(a[i] > a[j])
                    d[i] = max(d[i], d[j] + 1);
            }
        }
        int ans = 0;
        for (int i : d) if(i > ans) ans = i;
        System.out.println(ans);
    }
}

