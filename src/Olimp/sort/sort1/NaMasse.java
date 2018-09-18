package Olimp.sort.sort1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class NaMasse {
    static class Node implements Comparable<Node>{
        String data;
        BigInteger gramm;
        long ans;

        public Node(String data) {
            this.data = data;
            String [] d = data.split(" ");
            switch (d[1]){
                case "mg":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("1"));
                    break;
                case "g":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("1000"));
                    break;
                case "kg":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("1000000"));
                    break;
                case "Mg":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("1000000000"));
                    break;
                case "Gg":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("1000000000000"));
                    break;
                case "mp":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("16380"));
                    break;
                case "p":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("16380000"));
                    break;
                case "kp":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("16380000000"));
                    break;
                case "Mp":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("16380000000000"));
                    break;
                case "Gp":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("16380000000000000"));
                    break;
                case "mt":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("1000000"));
                    break;
                case "t":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("1000000000"));
                    break;
                case "kt":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("1000000000000"));
                    break;
                case "Mt":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("1000000000000000"));
                    break;
                case "Gt":
                    gramm = BigInteger.valueOf(Long.parseLong(d[0])).multiply(new BigInteger("1000000000000000000"));
                    break;
                    default:
                        gramm = new BigInteger("1");
            }
        }

        @Override
        public int compareTo(Node node) {
            return this.gramm.compareTo(node.gramm);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Node [] nodes = new Node[n];
        String s;
        for (int i = 0; i < n; i++) {
            s = in.nextLine();
            nodes[i] = new Node(s);
        }
        Arrays.sort(nodes);
        for (Node node : nodes) System.out.println(node.data);
    }
}
