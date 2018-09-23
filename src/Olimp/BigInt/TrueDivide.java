package Olimp.BigInt;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class TrueDivide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.next());
        if(a.equals(BigInteger.ZERO)){
            System.out.print(0);
            return;
        }
        if(a.equals(BigInteger.ONE)){
            System.out.print(1);
            return;
        }
        BigInteger hi = new BigInteger("10").pow(1400);
        BigInteger lo = BigInteger.ZERO;
        while (hi.add(lo.negate()).compareTo(BigInteger.ZERO) > 0){
            BigInteger mid = lo.add(hi).divide(new BigInteger("2"));
            if (mid.pow(2).compareTo(a) == 0){
                System.out.print(mid.toString());
                return;
            }
            if (mid.pow(2).compareTo(a) > 0){
                if (mid.add(BigInteger.ONE.negate()).pow(2).compareTo(a) < 0){
                    System.out.print(mid.add(BigInteger.ONE.negate()).toString());
                    return;
                }
                else hi = mid;
            }
            else if(mid.pow(2).compareTo(a) < 0){
                if (mid.add(BigInteger.ONE).pow(2).compareTo(a) > 0){
                    System.out.print(mid.toString());
                    return;
                }
                else lo = mid;
            }
        }
    }
}
