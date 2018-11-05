package Olimp.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), tmp;
        ArrayList<Integer> odd = new ArrayList<>(), even = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tmp = in.nextInt();
            if((tmp & 1) == 1) odd.add(tmp);
            else even.add(tmp);
        }
        for (Integer i : odd) System.out.print(i + " ");
        System.out.println();
        for (Integer i : even) System.out.print(i + " ");
        System.out.println();
        System.out.println(odd.size() > even.size() ? "NO" : "YES");
    }
}
