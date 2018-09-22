package Olimp.BigInt;

import java.math.BigInteger;
import java.util.Scanner;

public class GoldABBA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.next()), b = new BigInteger(in.next()),
                c = new BigInteger(in.next());
        System.out.println(a.max(b).max(c));
    }
}
