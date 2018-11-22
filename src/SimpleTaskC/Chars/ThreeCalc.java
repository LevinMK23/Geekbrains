package SimpleTaskC.Chars;

import java.util.Scanner;


public class ThreeCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), k = in.nextLong();
        n = convertTo10(n);
        k = convertTo10(k);
        System.out.println(n + k);
    }

    private static long convertTo10(long n) {
        long ans = 0, mul = 1;
        while(n > 0){
            ans += (n % 10) * mul;
            mul *= 3;
            n /= 10;
        }
        return ans;
    }

}
