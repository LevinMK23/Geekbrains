package Olimp.sort.sort1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AriProg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        while (in.hasNext()) a.add(in.nextInt());
        Collections.sort(a);
        int d = a.get(1) - a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if(a.get(i) - a.get(i-1) != d){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
