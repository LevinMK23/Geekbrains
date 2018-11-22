package Olimp.func;

import java.util.Scanner;

public class Triangle {

    static class Point{
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

    }

    static class T{

        Point x, y, z;

        public T(Point x, Point y, Point z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        boolean checkPoint(Point point){
            double dx = x.x, dy = x.y;
            x.x = 0; x.y = 0;
            point.x -= dx; point.y -= dy;
            y.x -= dx; y.y -= dy;
            z.x -= dx; z.y -= dy;
            double m = (point.x * y.y - point.y * y.x) / (z.x * y.y - y.x * z.y);
            if(m >= 0 && m <= 1){
                double l = (point.x - m * z.x) / y.x;
                if(l >= 0 && l+m <= 1)
                    return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        T triangle = new T(new Point(in.nextLong(), in.nextLong()),
                new Point(in.nextLong(), in.nextLong()),
                new Point(in.nextLong(), in.nextLong()));
        Point point = new Point(in.nextLong(), in.nextLong());
        System.out.println(triangle.checkPoint(point) ? "In" : "Out");
    }
}
