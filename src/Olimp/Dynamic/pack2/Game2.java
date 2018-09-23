package Olimp.Dynamic.pack2;

import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n + 1], d1 = new int[n + 1], d2 = new int[n + 1];
        for (int i = 1; i < n+1; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 1; i < n + 1; i++) {
            d1[i] = 1;
        }
    }
}
