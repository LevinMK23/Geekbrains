package Olimp.IntegerAlg.IntegerDigits;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] s = in.nextLine().split(" ");
        System.out.println(factor(s[0], s[1]));
    }

    private static int factor(String s, String s1) {
        int d = s1.length();
        int n = Integer.parseInt(s);
        return factor(n, d);
    }

    private static int factor(int n, int d){
        return n <= 1 ? 1 : n * factor(n - d, d);
    }
}
