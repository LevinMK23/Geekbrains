package Olimp.Intro.Cycle;

import java.util.Scanner;
import static java.lang.Math.*;



/**
 * Created by teacher on 27.09.2018.
 */
public class Monetki {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt(), mul = in.nextInt();
        if(mul == 0) System.out.println(0 + " " + sum);
        for (int i = 1; i < mul; i++) {
            if(mul % i == 0 && mul / i + i == sum){
                System.out.println(min(i, mul / i) + " " +
                max(mul / i, i));
                return;
            }
        }
    }
}
