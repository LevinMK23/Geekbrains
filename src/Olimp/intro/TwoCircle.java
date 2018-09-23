package Olimp.intro;

import java.util.Scanner;

import static java.lang.Long.max;
import static java.lang.Long.min;

public class TwoCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextInt(), y = in.nextInt(), r = in.nextInt();
        long x1 = in.nextInt(), y1 = in.nextInt(), r1 = in.nextInt();
        System.out.println((x1-x)*(x1-x) + (y1-y)*(y1-y) > (r + r1) * (r + r1) ||
                Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y)) + min(r, r1) < max(r, r1)   ? "NO" : "YES");
    }
}
