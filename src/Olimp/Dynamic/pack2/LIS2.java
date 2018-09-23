package Olimp.Dynamic.pack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Math.max;


public class LIS2 {

    static int [] pos, pr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
                f = in.nextInt(),
                k = in.nextInt(),
                b = in.nextInt(),
                m = in.nextInt();
        pos = new int[n];
        pr = new int[n];
        int [] a = generate(n, f, k, b, m);
        int [] dp = solve(a);
        int ma = 0, po = pos[pos.length-1];
        ArrayList<Integer> list = new ArrayList<>();
        /*while (po != 1){
            list.add(a[po]);
            po = pos[po];
        }*/
        System.out.println(Arrays.toString(dp));
        System.out.println(Arrays.toString(pos));
        System.out.println(Arrays.toString(pr));
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static int[] solve(int[] a) {
        int [] d = new int[a.length];
        d[0] = Integer.MIN_VALUE;
        for (int i = 1; i < d.length; i++) {
            d[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < a.length; i++) {
            int j = find(d, a[i]);
            if (d[j-1] < a[i] && a[i] < d[j]) {
                d[j] = a[i];
                pos[j] = i;
                pr[i] = pos[j-1];
            }
        }
        return d;
    }

    private static int find(int[] d, int el) {
        int low = 0;
        for (int i = 0; i < d.length; i++) {
            if(d[i] > el) return i;
        }
        return low;
    }

    private static int[] generate(int n, int f, int k, int b, int m) {
        int [] a = new int[n];
        a[0] = f;
        for (int i = 1; i < n; i++) {
            a[i] = (int)(((long)a[i-1] * (long) k + (long)b) % (long)m);
        }
        return a;
    }
}
