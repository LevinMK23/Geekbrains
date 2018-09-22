package Olimp.BigInt;

import java.math.BigInteger;
import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.next()), b = new BigInteger(in.next());
        System.out.println(a.add(b.negate()));
    }
}
