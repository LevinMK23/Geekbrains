package Olimp.func;

import java.util.Scanner;

public class HappyTicket {
    public static void main(String[] args) {
        char [] a = new Scanner(System.in).next().toCharArray();
        if(a.length == 1) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            int sum1 = calc(0, i, a), sum2 = calc(i, a.length, a);
            if(sum1 == sum2){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    private static int calc(int l, int r, char[] a) {
        int sum = 0;
        for (int i = l; i < r; i++) {
            sum += a[i]-'0';
        }
        if(sum > 9){
            StringBuilder sb = new StringBuilder();
            while(sum > 0){
                sb.append(sum % 10);
                sum /= 10;
            }
            char [] b = sb.toString().toCharArray();
            return calc(0, b.length, b);
        }
        else
            return sum;
    }
}
