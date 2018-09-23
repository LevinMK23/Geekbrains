package Olimp.Dynamic.pack1;

import java.util.Scanner;

public class StairsBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long [] d = new long[n+1];
        if(n == 1 || n == 2){
            System.out.println(n);
            return;
        }
        d[n] = 1;
        d[n-1] = 1;
        d[n-2] = 2;
        for (int i = n; i >= 3; i--) {
            d[i-3] = d[i-2] + d[i-1] + d[i];
        }
        System.out.println(d[0]);
    }
}
