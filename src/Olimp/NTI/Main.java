package Olimp.NTI;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n],
                b = new int[n],
                c = new int[n],
                as = new int[101],
                bs = new int[101],
                cs = new int[101];

        double sa = 0, sb = 0, sc = 0,
                ma, mb, mc;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            c[i] = in.nextInt();
            as[a[i]]++; bs[b[i]]++; cs[c[i]]++;
            sa += a[i]; sb += b[i]; sc += c[i];
        }
        sa /= n;
        sb /= n;
        sc /= n;
        int p = 0;
        for (int i = 0; i <= 100; i++) {
            while(as[i] > 0){
                a[p++] = i;
                as[i]--;
            }
        }
        p = 0;
        for (int i = 0; i <= 100; i++) {
            while(bs[i] > 0){
                b[p++] = i;
                bs[i]--;
            }
        }
        p = 0;
        for (int i = 0; i <= 100; i++) {
            while(cs[i] > 0){
                c[p++] = i;
                cs[i]--;
            }
        }
        ma = n % 2 == 0 ? (a[n/2] + a[n/2 - 1]) / 2. : a[n/2];
        mb = n % 2 == 0 ? (b[n/2] + b[n/2 - 1]) / 2. : b[n/2];
        mc = n % 2 == 0 ? (c[n/2] + c[n/2 - 1]) / 2. : c[n/2];
        System.out.println(sa + " " + sb + " " + sc);
        System.out.println(ma + " " + mb + " " + mc);
        int erase = n / 10;
        sa = 0; sb = 0; sc = 0;
        for (int i = erase; i < n - erase; i++) {
            sa += a[i]; sb += b[i]; sc += c[i];
        }
        sa /= (n - 2 * erase);
        sb /= (n - 2 * erase);
        sc /= (n - 2 * erase);
        System.out.println(sa + " " + sb + " " + sc);
        System.out.println(ma + " " + mb + " " + mc);
    }
}
