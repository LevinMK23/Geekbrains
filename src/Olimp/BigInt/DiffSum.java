package Olimp.BigInt;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import static java.lang.Math.max;

public class DiffSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next(), b = in.next(), c = in.next();
        String [] ans = new String[6];
        ans[0] = sum(a, b, c);
        ans[1] = sum(a, c, b);
        ans[2] = sum(b, a, c);
        ans[3] = sum(b, c, a);
        ans[4] = sum(c, a, b);
        ans[5] = sum(c, b, a);
        TreeSet<BigInteger> res = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            res.add(new BigInteger(ans[i]));
        }
        if (res.size() == 1) System.out.println("NO\n" + res.first());
        else {
            System.out.println("YES");
            for (BigInteger i : res) System.out.println(i);
        }
    }

    private static String sum(String a, String b, String c) {
        return sum(sum(a, b), c);
    }

    private static String sum(String a, String b){
        int max = max(b.length(), a.length());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < max; i++) {
            int d = 0;
            if(a.length() - i - 1 >= 0)
                d += a.charAt(a.length()-i-1)-'0';
            if(b.length() - i - 1 >= 0)
                d += b.charAt(b.length()-i-1)-'0';
            ans.insert(0, d);
        }
        return String.valueOf(ans.toString());
    }

}
