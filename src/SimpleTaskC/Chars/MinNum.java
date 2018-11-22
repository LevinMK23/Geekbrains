package SimpleTaskC.Chars;

import java.util.Arrays;
import java.util.Scanner;

public class MinNum {

    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int [] a = {1, 2, 3};
        System.out.println(Arrays.toString(a));
        int ma = 0, maC = -100;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) - '0' > ma && s.charAt(i) >= '0' && s.charAt(i) <= '9')
                ma = s.charAt(i) - '0';
            if(s.charAt(i) - 'A' > maC)
                maC = s.charAt(i) - 'A';
            if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9' ||
            s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(Math.max(ma + 1, 10 + maC + 1));
    }
}
