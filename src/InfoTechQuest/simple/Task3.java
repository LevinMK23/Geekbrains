package InfoTechQuest.simple;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    static String dir = "/home/acid/IdeaProjects/Geekbrains/src/InfoTechQuest/test/simple/task3/";

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
                long p = in.nextLong(), q = in.nextLong();
                if(p * p - 4 * q < 0) out.println("NO ROOTS");
                else if(p * p - 4 * q == 0) out.println(- p / 2);
                else {
                    long x1 = (-p - (long)Math.sqrt(p * p - 4 * q)) / 2;
                    long x2 = (-p + (long)Math.sqrt(p * p - 4 * q)) / 2;
                    out.println(x1 + " " + x2);
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
                if(i < 20) {
                    int c = r.nextInt();
                    out.println((long) 2 * c + " " + (long) c * c);
                }
                else if(i < 40){
                    long x1 = r.nextInt(),
                            x2 = r.nextInt();
                    out.println((long)(-x1-x2) + " " + (long)x1 * x2);
                }
                else {
                    long c = 10000 + (long)r.nextInt(1000) * r.nextInt(1000000);
                    long b = r.nextInt(100);
                    out.println(b + " " + c);
                }
            }
        }
    }
}
