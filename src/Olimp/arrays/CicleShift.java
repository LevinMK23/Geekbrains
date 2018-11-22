package Olimp.arrays;

import java.util.Scanner;

public class CicleShift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        if(k > 0){
            for (int i = n - (k % n); i < n; i++) {
                System.out.print(a[i] + " ");
            }
            for (int i = 0; i < n - (k % n); i++) {
                System.out.print(a[i] + " ");
            }
        }
        else{
            for (int i = (-k) % n; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            for (int i = 0; i < (-k) % n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
