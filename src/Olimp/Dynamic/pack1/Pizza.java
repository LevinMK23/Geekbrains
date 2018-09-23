package Olimp.Dynamic.pack1;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(rec(n));
    }
    static long rec(int n){
        if(n == 1) return 2;
        if(n == 2) return 4;
        return n + rec(n-1);
    }
}
