package Olimp.Dynamic.pack2;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.min;

public class BiggestMatrix {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        char [][] m = new char[n][n];
        int [][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            for (int j = 0; j < s.length(); j++) {
                m[i][j] = s.charAt(j);
                d[i][j] = m[i][j] - '0';
            }
        }
        if(n == 1){
            System.out.println(m[0][0]);
            return;
        }
        int ans = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(m[i][j] == '1') d[i][j] = min3(d[i-1][j], d[i-1][j-1], d[i][j-1]) + 1;
                if(d[i][j] > ans) ans = d[i][j];
            }
        }
        System.out.println(ans * ans);
    }

    static int min3(int a, int b, int c){
        return min(min(a, b), c);
    }
}