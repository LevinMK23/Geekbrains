package Olimp.IntegerAlg.IntegerDigits;

import java.util.Scanner;

public class Beauty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), m = in.nextLong(), co = 0;
        long [] b = {6,
                28,
                496,
                8128,
                33550336,
                8589869056L,
                137438691328L,
                2305843008139952128L};
        for (int i = 0; i < b.length; i++) {
            if(b[i] >= n && b[i] <= m) {
                System.out.println(b[i]);
                co++;
            }
        }
        if(co == 0) System.out.println("Absent");
    }
    private static boolean prime(long i) {
        for (long j = 2; j * j <= i ; j++) {
            if(i % j == 0) return false;
        }
        return true;
    }
}
