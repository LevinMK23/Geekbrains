package Olimp.IntegerAlg.IntegerDigits;

import java.util.ArrayList;
import java.util.Scanner;

public class Smith {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] s = in.nextLine().split(" ");
        int [] data = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            data[i] = Integer.parseInt(s[i]);
            if(smith(data[i])) System.out.print(1);
            else System.out.print(0);
        }
    }

    private static int sum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private static boolean smith(int n) {
        int sum = sum(n), sumD = 0;
        if(prime(n)) return false;
        ArrayList<Integer> del = makeDel(n);
        for (Integer i : del){
            sumD += sum(i);
        }
        return sum == sumD;
    }

    private static boolean prime(int i) {
        for (int j = 2; (long)j * j <= i ; j++) {
            if(i % j == 0) return false;
        }
        return true;
    }

    private static ArrayList<Integer> makeDel(int n) {
        ArrayList<Integer> d = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                d.add(i);
                n /= i;
            }
        }
        return d;
    }
}
