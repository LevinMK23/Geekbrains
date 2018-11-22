package Olimp.arrays;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pmax = -1, pmin = -1, n = in.nextInt(), max = -1000, min = 1000, sum = 0, mul = 1;
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if(a[i] > max){
                max = a[i];
                pmax = i;
            }
            if(a[i] < min){
                min = a[i];
                pmin = i;
            }
            if(a[i] > 0) sum += a[i];
        }
        for (int i = Integer.min(pmin, pmax)+1; i <= Integer.max(pmin, pmax)-1; i++) {
            mul *= a[i];
        }
        System.out.println(sum + " " + mul);
    }
}
