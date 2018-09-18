package Olimp.sort.sort1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Mag {

    static class Node{

        int v, n;

        public Node(int v, int n) {
            this.v = v;
            this.n = n;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node [] a = new Node[n], b = new Node[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Node(in.nextInt(), i + 1);
        }
        for (int i = 0; i < n; i++) {
            b[i] = new Node(in.nextInt(), i + 1);
        }
        Arrays.sort(a, Comparator.comparingInt(o -> -o.v));
        Arrays.sort(b, Comparator.comparingInt(o -> o.v));
        for (int i = 0; i < n; i++) {
            System.out.print(a[i].n + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(b[i].n + " ");
        }
    }
}
