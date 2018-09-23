package Olimp.Dynamic.pack2;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class ComputerGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 1) {
            System.out.println(0);
            return;
        }
        int [] a = new int[n + 1], d = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            a[i] = in.nextInt();
        }
        d[1] = 0;
        d[2] = abs(a[2] - a[1]);
        if (n == 2) {
            System.out.println(d[2]);
            return;
        }
        for (int i = 3; i < n+1; i++) {
            d[i] = min(d[i-1] + abs(a[i] - a[i-1]), d[i-2] + 3* abs(a[i-2] - a[i]));
        }
        System.out.println(d[n]);
    }
}
