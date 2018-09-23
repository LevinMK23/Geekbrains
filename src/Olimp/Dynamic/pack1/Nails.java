package Olimp.Dynamic.pack1;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

import static java.lang.Integer.min;
import static java.lang.Math.abs;

public class Nails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int [] d = new int[n+1];
        d[0] = 0;
        d[1] = Integer.MAX_VALUE;
        for (int i = 2; i < n+1; i++) {
            d[i] = min(d[i-1], d[i-2]) + a[i-1] - a[i-2];
        }
        System.out.println(d[n]);
    }
}
