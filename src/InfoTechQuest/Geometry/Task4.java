package InfoTechQuest.Geometry;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task4 {

    static class Line{
        long x1, y1, x2, y2, a, b, c;

        public Line(long x1, long y1, long x2, long y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            a = y2 - y1;
            b = x1 - x2;
            c = (x2 - x1) * y1 - (y2 - y1) * x1;
        }

        int check(long x, long y){
            if(a * x + b * y + c == 0) return 0;
            if(a * x + b * y + c > 0) return -1;
            return 1;
        }
    }

    static String dir = "/home/acid/IdeaProjects/Geekbrains/src/InfoTechQuest/test/task4/";

    public static void main(String[] args) throws IOException {
        gen(dir);
        ans(dir);
    }

    private static void ans(String dir) throws IOException {
        for (int i = 0; i < 50; i++) {
            Scanner in = new Scanner(new File(dir + i));
            File file = new File(dir + i + ".clue");
            boolean f = file.createNewFile();
            try (PrintWriter out = new PrintWriter(file)) {
                long tx = in.nextLong(), ty = in.nextLong();
                Line lines = new Line(in.nextLong(), in.nextLong(),
                        in.nextLong(), in.nextLong());
                long sx = in.nextLong(), sy = in.nextLong();
                if (lines.check(tx, ty) * lines.check(sx, sy) == -1) {
                    Task4.Line l1 = new Task4.Line(tx, ty, lines.x1, lines.y1);
                    Task4.Line l2 = new Task4.Line(tx, ty, lines.x2, lines.y2);
                    if (l1.check(sx, sy) * l2.check(sx, sy) == -1) {
                        out.println("OK");
                    }
                    else {
                        out.println("SPY DETECTED");
                    }
                } else out.println("SPY DETECTED");
            }
        }
    }


    private static void gen(String dir) throws IOException {
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            File file = new File(dir + i);
            boolean f = file.createNewFile();
            try(PrintWriter out = new PrintWriter(file)){
                if(i < 10) {
                    out.println(r.nextInt(100) + " " + r.nextInt(100));
                    out.println(r.nextInt(100) + " " + r.nextInt(100)
                     + " " + r.nextInt(100) + " " + r.nextInt(100));
                    out.println(r.nextInt(100) + " " + r.nextInt(100));
                }
                else if(i < 20){
                    out.println(r.nextInt(10000) + " " + r.nextInt(10000));
                    out.println(r.nextInt(10000) + " " + r.nextInt(10000)
                            + " " + r.nextInt(10000) + " " + r.nextInt(10000));
                    out.println(r.nextInt(10000) + " " + r.nextInt(10000));
                }
                else if(i < 40){
                    out.println(r.nextInt() + " " + r.nextInt());
                    out.println(r.nextInt() + " " + r.nextInt()
                            + " " + r.nextInt() + " " + r.nextInt());
                    out.println(r.nextInt() + " " + r.nextInt());
                }
                else {
                    out.println(r.nextInt() + " " + r.nextInt());
                    out.println(r.nextInt() + " " + r.nextInt()
                            + " " + r.nextInt() + " " + r.nextInt());
                    out.println(r.nextInt() + " " + r.nextInt());
                }
            }
        }
    }

}
