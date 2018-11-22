package InfoTechQuest.Geometry;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Task2 {

    static String dir = "/home/acid/IdeaProjects/Geekbrains/src/InfoTechQuest/test/task2/";

    public static void main(String[] args) throws IOException {
        gen(dir);
        ans(dir);
    }

    private static void ans(String dir) throws IOException {
        for (int i = 0; i < 50; i++) {
            Scanner in = new Scanner(new File(dir + i));
            File file = new File(dir + i + ".clue");
            boolean f = file.createNewFile();
            try(PrintWriter out = new PrintWriter(file)) {
                long a = in.nextLong(), b = in.nextLong(), c = in.nextLong(),
                        d = in.nextLong(), x1, y1, x2, y2;
                long x = in.nextLong(), y = in.nextLong();
                x1 = min(a, c);
                x2 = max(a, c);
                y1 = min(b, d);
                y2 = max(b, d);
                if (x >= x1 && x <= x2 && y >= y1 && y < y1 + (y2 - y1) / 2 + 1) {
                    out.println(5);
                }
                else if(x >= x1 && x <= x2 && y >= y1 && y <= y2){
                    out.println(3);
                }
                else {
                    out.println(2);
                }
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
                    out.println(r.nextInt(100) + " " + r.nextInt(100));
                    out.println(r.nextInt(100) + " " + r.nextInt(100));
                }
                else if(i < 20){
                    out.println(r.nextInt(1000) + " " + r.nextInt(1000));
                    out.println(r.nextInt(1000) + " " + r.nextInt(1000));
                    out.println(r.nextInt(100000) + " " + r.nextInt(100000));
                }
                else if(i < 40){
                    out.println(r.nextInt() + " " + r.nextInt());
                    out.println(r.nextInt() + " " + r.nextInt());
                    out.println(r.nextInt() + " " + r.nextInt());
                }
                else {
                    out.println(r.nextLong() + " " + r.nextLong());
                    out.println(r.nextLong() + " " + r.nextLong());
                    out.println(r.nextLong() + " " + r.nextLong());
                }
            }
        }
    }
}
