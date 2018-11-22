package SimpleTaskC.Chars;

import java.util.Scanner;

public class KSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt(), k = in.nextInt();
        n = convertToK(n, k);
        long mul = 1, sum = 0;
        while(n > 0){
            mul *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        System.out.println(mul - sum);
    }

    static long convertToK(long n, long k){
        long ans = 0, r = 1;
        while(n > 0){
            ans += (n % k) * r;
            r *= 10;
            n /= k;
        }
        return ans;
    }
}
