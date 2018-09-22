package Olimp.BigInt;

import java.math.BigInteger;
import java.util.Scanner;

public class Pow2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(new BigInteger("2").pow(n));
    }
}
