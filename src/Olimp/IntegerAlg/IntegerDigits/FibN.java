package Olimp.IntegerAlg.IntegerDigits;

import java.util.Scanner;

public class FibN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}
