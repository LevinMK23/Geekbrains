package Olimp.sort.sort1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lexik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt(), invCo = 0;
        ArrayList<String> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            a.add(String.valueOf(i));
        }
        Collections.sort(a);
        System.out.println(a.indexOf(String.valueOf(k)) + 1);
    }
}
