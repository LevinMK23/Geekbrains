package Olimp.BigInt;

import java.math.BigInteger;
import java.util.Scanner;

public class MulDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger d = new BigInteger(in.next());
        BigInteger d1 = new BigInteger(in.next());
        System.out.println(d.add(d1));
        System.out.println(d.multiply(d1));
        System.out.println(d.subtract(d1));
        System.out.println(d.add(d1.negate()));
        System.out.println(d.pow(3));
        //System.out.println(d.sqrt());
        System.out.println(d.mod(d1));
        System.out.println(d.divide(d1));
    }
}
