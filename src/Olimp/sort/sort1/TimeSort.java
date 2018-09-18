package Olimp.sort.sort1;

import java.util.Arrays;
import java.util.Scanner;

public class TimeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), invCo = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int h = in.nextInt(), m = in.nextInt(), s = in.nextInt();
            a[i] = h * 100000 + m * 1000 + s;
        }
        Arrays.sort(a);
        for (int i : a){
            System.out.println(i / 100000 + " " + (i % 100000) / 1000 + " " + (i % 1000000) % 1000);
        }
    }
}
