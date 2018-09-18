package Olimp.sort.sort1;

import java.util.Arrays;
import java.util.Scanner;

public class Buhgalter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        boolean fn = false, fm = false;
        if(n < 0){
            n = -n;
            fn = true;
        }
        if(m < 0){
            m = -m;
            fm = true;
        }
        int [] a = splitDigits(n), b = splitDigits(m);
        Arrays.sort(a);
        Arrays.sort(b);
        int [] ma, mi;
        if(max(a, b)){
            ma = a;
            mi = b;
        }
        else{
            ma = b;
            mi = a;
        }
        n = makeDigit(ma);
        m = makeDigitMin(mi);
        if((!fn && fm) || (fn && !fm))System.out.println(n + m);
        else System.out.println(n - m);
    }

    private static boolean max(int[] a, int[] b) {
        if (a.length > b.length) return true;
        else if(a.length < b.length) return false;
        for (int i = a.length-1; i >= 0; i--) {
            if(a[i] > b[i]) return true;
            else if(a[i] < b[i])return false;
        }
        return false;
    }

    private static int makeDigitMin(int[] b) {
        int ans = 0, pos = 0, r = 1;
        if (b.length < 2) return b[0];
        else {
            while (b[pos] == 0) {
                pos++;
            }
            ans += Math.pow(10, b.length - 1) * b[pos];
            b[pos] = 0;
            for (int i = 0; i < b.length; i++) {
                ans += Math.pow(10, b.length - i - 1) * b[i];
            }
            return ans;
        }
    }


    private static int makeDigit(int[] b) {
        int ans = 0, r = 1;
        for (int i = 0; i < b.length ; i++) {
            ans += b[i] * r;
            r *= 10;
        }
        return ans;
    }

    private static int[] splitDigits(int m) {
        int len = 0, n = m;
        if(m == 0){
            return new int[]{0};
        }
        while(m > 0){
            m /= 10;
            len++;
        }
        int [] ans = new int[len];
        int i = len - 1;
        while (n > 0){
            ans[i] = n % 10;
            n /= 10;
            i--;
        }
        return ans;
    }
}
