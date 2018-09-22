package Olimp.BigInt;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {

    static class Node{
        String max, min;

        public Node(String max, String min) {
            this.max = max;
            this.min = min;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aa =in.next(), bb = in.next(), max, min;
        if(aa.equals("0") && bb.equals("0")){
            System.out.println(0);
            return;
        }

    }

}
