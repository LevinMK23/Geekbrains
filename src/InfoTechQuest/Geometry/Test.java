package InfoTechQuest.Geometry;

import java.util.Scanner;

public class Test {

    static class Line{
        long x1, y1, x2, y2, a, b, c;

        public Line(long x1, long y1, long x2, long y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            a = y1 - y2;
            b = x2 - x1;
            c = (y2 - y1) * x1 + (x1 - x2) * y1;
        }

        int check(long x, long y){
            if(a * x + b * y + c == 0) return 0;
            if(a * x + b * y + c > 0) return -1;
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long tx = in.nextLong(), ty = in.nextLong();
        Line lines = new Line(in.nextLong(), in.nextLong(), in.nextLong(), in.nextLong());
        long sx = in.nextLong(), sy = in.nextLong();
        if(lines.check(tx, ty) * lines.check(sx, sy) < 0) {
            Line l1 = new Line(tx, ty, lines.x1, lines.y1);
            Line l2 = new Line(tx, ty, lines.x2, lines.y2);
            if (l1.check(sx, sy) * l2.check(sx, sy) < 0) {
                System.out.println("OK");
            }
            else {
                System.out.println("SPY DETECTED");
            }
        }
        else System.out.println("SPY DETECTED");
    }
}

