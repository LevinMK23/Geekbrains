package Olimp.NTI;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Long.min;
import static java.lang.Math.abs;
import static java.lang.Math.max;

public class WH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int w = r.nextInt(1000);
        StringBuilder s = new StringBuilder();
        while (w-- > 0){
            s.append((char)('A' + r.nextInt(26)));
        }
        s.append("\n");
        int ww = r.nextInt(500);
        while (ww-- > 0){
            s.append((char)('A' + r.nextInt(26)));
        }
        System.out.println(s);
    }
}
