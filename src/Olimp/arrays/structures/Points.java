package Olimp.arrays.structures;

import java.util.Scanner;

public class Points {

    static class Point{
        long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    static double distance(Point from, Point to){
        return Math.sqrt((from.x-to.x) * (from.x-to.x)
        + (from.y - to.y) * (from.y - to.y));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Point [] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(in.nextLong(), in.nextLong());
        }
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                double dis = distance(points[i], points[j]);
                if(dis < min){
                    min = dis;
                    p1 = i; p2 = j;
                }
                if(dis > max){
                    max = dis;
                    p3 = i; p4 = j;
                }
            }
        }
        System.out.println((p1+1) + " " + (p2+1));
        System.out.println((p3+1) + " " + (p4+1));
    }
}
