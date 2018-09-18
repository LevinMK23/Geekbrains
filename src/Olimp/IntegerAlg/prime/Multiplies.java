package Olimp.IntegerAlg.prime;

import java.util.Scanner;

public class Multiplies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long j = 2;
        while(j  * j <= n){
            if(n % j == 0){
                System.out.printf("%d*", j);
                n /= j;
            }
            else j++;
        }
        System.out.printf("%d", n);
    }
}
