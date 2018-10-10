package Olimp;

import java.util.HashMap;
import java.util.Scanner;

public class Bin {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println((n & (n - 1)) == 0 ? "OK" : "WRONG");
    }
}
