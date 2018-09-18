package Olimp.IntegerAlg.prime;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeWeights {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), mP = 0;
        int [] vis = new int[1000000];
        ArrayList<Integer> primes = makeSieve(2 * n - 1);
        mP = primes.get(primes.size()-1);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(mP - j <= n && mP - j >= 1 && vis[j] == 0 && vis[mP - j] == 0) {
                    System.out.println(mP - j + " " + j);
                    vis[j] = 1;
                    vis[mP - j] = 1;
                    break;
                }
            }
            if(i == primes.size()) break;
            mP = primes.get(primes.size() - i);

        }
    }

    private static ArrayList<Integer> makeSieve(int n) {
        int [] d = new int[n+1];
        d[0] = 1; d[1] = 1;
        for(int i = 2; i <= n; i++){
            if(d[i] == 0) {
                if((long)i * i <= n){
                    for (int j = i * i; j <= n; j+=i) {
                        d[j] = 1;
                    }
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(d[i] == 0) ans.add(i);
        }
        return ans;
    }

    private static boolean prime(int i) {
        for (int j = 2; (long)j * j <= i ; j++) {
            if(i % j == 0) return false;
        }
        return true;
    }

}
