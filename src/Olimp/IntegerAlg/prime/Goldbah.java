package Olimp.IntegerAlg.prime;

import java.util.ArrayList;
import java.util.Scanner;

public class Goldbah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> primes = makeSieve(n);
        //System.out.println(primes);
        int pos = 0, tmp = 0;
        while(true) {
            tmp = primes.get(pos);
            for (int i = pos; i < primes.size(); i++) {
                if(primes.get(i) == n - tmp){
                    System.out.println(tmp + " " + primes.get(i));
                    return;
                }
            }
            pos++;
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
}
