package Olimp.BigInt;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class TrueDivide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal a = new BigDecimal(in.next());
        System.out.println(a.pow(0.5));
    }
}
