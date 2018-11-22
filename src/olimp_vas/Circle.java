package olimp_vas;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;


public  class Circle {

        public static void main(String[] args) throws IOException {
            gen();
            ans();
        }

        static void ans() throws IOException {
            String path = "/Users/levinMK/IdeaProjects/Geekbrains/src/tests/circle/";
            for (int i = 1; i < 50; i++) {
                File file = new File(path + i);
                Scanner in = new Scanner(file);
                long x = in.nextLong(), y = in.nextLong(), r = in.nextLong();
                long x1 = in.nextLong(), y1 = in.nextLong(), r1 = in.nextLong();
                File ans = new File(path + i + ".clue");
                ans.createNewFile();
                try(PrintWriter out = new PrintWriter(ans)){
                    out.write(((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y) > (r + r1) * (r + r1) ||
                            Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y)) + min(r, r1) < max(r, r1) ? "NO" : "YES"));
                }
            }
        }

        static void gen() throws IOException {
            String path = "/Users/levinMK/IdeaProjects/Geekbrains/src/tests/circle/";
            Random r = new Random();
            for (int i = 1; i < 50; i++) {
                File file = new File(path + i);
                file.createNewFile();
                try(PrintWriter out = new PrintWriter(file)){
                    if(i < 10) {
                        out.write(r.nextInt(10)
                                + " " + r.nextInt(10) + " " + r.nextInt(10));
                        out.write("\n");
                        out.write(r.nextInt(10)
                                + " " + r.nextInt(10) + " " + r.nextInt(10));
                        out.write("\n");
                    }
                    else if(i < 30) {
                        out.write(r.nextInt(100)
                                + " " + r.nextInt(100) + " " + r.nextInt(100));
                        out.write("\n");
                        out.write(r.nextInt(100)
                                + " " + r.nextInt(100) + " " + r.nextInt(100));
                        out.write("\n");
                    }
                    else if(i < 40) {
                        out.write(r.nextInt(1000)
                                + " " + r.nextInt(1000) + " " + r.nextInt(1000));
                        out.write("\n");
                        out.write(r.nextInt(1000)
                                + " " + r.nextInt(1000) + " " + r.nextInt(1000));
                        out.write("\n");
                    }
                    else{
                        out.write(r.nextInt(1000000000)
                                + " " + r.nextInt(1000000000) + " " + r.nextInt(1000000000));
                        out.write("\n");
                        out.write(r.nextInt(1000000000)
                                + " " + r.nextInt(1000000000) + " " + r.nextInt(1000000000));
                        out.write("\n");
                    }
                }
            }
        }
}
