package SimpleTaskC.Chars;

import java.util.Scanner;

public class BitReverse {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String s = Integer.toBinaryString(n);
        String ans = "";
        int i = 0;
        while (s.charAt(i++) == '0');
        int sum = 0, r = 1;
        for(int j = i-1; j < s.length(); j++){
            sum += (s.charAt(j) - '0') * r;
            r *= 2;
        }
        System.out.println(sum);
    }
}
