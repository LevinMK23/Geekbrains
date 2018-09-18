package Olimp.sort.sort1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Wedding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), invCo = 0;
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        double total = in.nextInt();
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if(a[i] > total){
                total = (total + a[i]) / 2.;
            }
        }
        String ans = String.format("%.6f", total);
        for (int i = 0; i < ans.length(); i++) {
            if(ans.charAt(i) == ',')
                System.out.print(".");
            else
                System.out.print(ans.charAt(i));
        }
    }
}
