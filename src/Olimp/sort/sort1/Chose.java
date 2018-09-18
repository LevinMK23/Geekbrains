package Olimp.sort.sort1;

import java.util.Arrays;
import java.util.Scanner;

public class Chose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), invCo = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < a.length / 2 + 1; i++) {
            ans += a[i] / 2 + 1;
        }
        System.out.println(ans);
    }
}
