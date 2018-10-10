package Olimp.sort.sort1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSort {

    static long ans = 0;

    static class Pair{
        int val, num;

        public Pair(int val, int num) {
            this.val = val;
            this.num = num;
        }
    }

    static class Node{

        int [] data;
        long sum;

        public Node(int [] data) {
            this.data = data;
            Pair [] buf = new Pair[data.length];
            sum =  0;
            for (int i = 0; i < buf.length; i++) {
                buf[i] = new Pair(data[i], i);
            }
            Arrays.sort(buf, Comparator.comparingInt(o->o.val));
            int counter = 0;
            for (int i = buf.length - 1; i >= 0 ; i--) {
                sum += (buf.length - buf[i].num - 1 - counter) > 0 ?
                        (buf.length - buf[i].num - 1 - counter) : 0;
                counter++;
            }
            ans += sum;
        }

    }
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        Node [] data = new Node[k];
        for (int i = 0; i < k; i++) {
            int [] tmp = new int[n];
            for (int j = 0; j < n; j++) {
                tmp[j] = in.nextInt();
            }
            data[i] = new Node(tmp);
        }
        System.out.println(ans);
    }

}