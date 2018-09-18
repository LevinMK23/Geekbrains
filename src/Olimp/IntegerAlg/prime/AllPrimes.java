package Olimp.IntegerAlg.prime;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPrimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), co = 0;
        ArrayList<Integer> primes = makeSieve(m);
        for (Integer i : primes){
            if(i >= n && i <= m) {
                System.out.println(i);
                co++;
            }
        }
        if(co == 0) System.out.println("Absent");
    }

    private static ArrayList<Integer> makeSieve(int n) {
        ArrayList<Integer> d = new ArrayList<Integer>();
        for (int i = 0; i < n + 1; i++) {
            d.add(0);
        }
        d.set(0,1); d.set(1,1);
        for(int i = 2; i <= n; i++){
            if(d.get(i) == 0) {
                if((long)i * i <= n){
                    for (int j = i * i; j <= n; j+=i) {
                        d.set(j,1);
                    }
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(d.get(i) == 0) ans.add(i);
        }
        return ans;
    }

}
