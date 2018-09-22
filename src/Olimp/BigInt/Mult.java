package Olimp.BigInt;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Mult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.next()), b = new BigInteger(in.next());
        int k = in.nextInt();
        System.out.println(a.multiply(new BigInteger("10").pow(k)).divide(b).mod(new BigInteger("10")));
    }
}
