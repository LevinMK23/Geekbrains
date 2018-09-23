package Olimp.Dynamic.pack1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Long.min;

public class Agent {
    static class Node{
        long old, r;

        public Node(long old, long r) {
            this.old = old;
            this.r = r;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node [] nodes = new Node[n+1];
        nodes[0] = new Node(-1,-1);
        for (int i = 1; i <= n; i++) {
            nodes[i] = new Node(in.nextInt(), in.nextInt());
        }
        Arrays.sort(nodes, Comparator.comparingLong(o->o.old));
        if (n == 2){
            System.out.println(nodes[2].r);
            return;
        }
        long [] d = new long[n+1];
        d[1] = nodes[2].r;
        d[2] = nodes[2].r;
        for (int i = 3; i < n+1; i++) {
            d[i] = min(d[i-1], d[i-2]) + nodes[i].r;
        }
        System.out.println(d[n]);
    }
}