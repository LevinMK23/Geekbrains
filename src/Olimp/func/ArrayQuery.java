package Olimp.func;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayQuery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }
        int m = in.nextInt(), l, r;
        in.nextLine();
        for (int i = 0; i < m; i++) {
            String [] line = in.nextLine().split(" ");
            switch (line[0]){
                case "rsq":
                    l = Integer.parseInt(line[1])-1;
                    r = Integer.parseInt(line[2])-1;
                    int sum = 0;
                    for (int j = l; j <= r; j++) {
                        sum += a.get(j);
                    }
                    System.out.println(sum);
                    break;
                case "update":
                    l = Integer.parseInt(line[1])-1;
                    r = Integer.parseInt(line[2])-1;
                    for (int j = l; j <= r; j++) {
                        a.set(j, Integer.valueOf(line[3]));
                    }
                    break;
                case "rmq":
                    l = Integer.parseInt(line[1])-1;
                    r = Integer.parseInt(line[2])-1;
                    int min = Integer.MAX_VALUE;
                    for (int j = l; j <= r; j++) {
                        min = Math.min(min, a.get(j));
                    }
                    System.out.println(min);
                    break;
                case "add":
                    l = Integer.parseInt(line[1])-1;
                    r = Integer.parseInt(line[2])-1;
                    int add = Integer.parseInt(line[3]);
                    for (int j = l; j <= r; j++) {
                        a.set(j, a.get(j) + add);
                    }
                    break;
                case "get":
                    l = Integer.parseInt(line[1])-1;
                    System.out.println(a.get(l));
                    break;
            }
        }
    }
}
