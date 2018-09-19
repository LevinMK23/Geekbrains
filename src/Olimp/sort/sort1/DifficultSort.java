package Olimp.sort.sort1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DifficultSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), tmp;
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < 201; i++) a.add("");
        for (int i = 0; i < n; i++) {
            tmp = in.nextInt();
            a.set(tmp + 100, a.get(tmp + 100) + tmp + " ");
        }
        for (int i = 0; i < 201; i++) {
            if(!a.get(i).isEmpty())System.out.print(a.get(i));
        }
        System.out.println();
    }
}
