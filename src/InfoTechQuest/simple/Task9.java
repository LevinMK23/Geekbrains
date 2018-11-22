package InfoTechQuest.simple;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Task9 {

    static String dir = "/home/acid/IdeaProjects/Geekbrains/src/InfoTechQuest/test/simple/task9/";

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
                long a = in.nextLong(), b = in.nextLong();
                while (a % 5 != 0) a++;
                while (b % 5 != 0) b--;
                a -= 5;
                out.println((b - a) / 5);
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
                    int a = abs(r.nextInt(1000000000));
                    int b = a + r.nextInt(30) + 6;
                    out.println(a + " " + b);
                }
                else if(i < 30){
                    int a = abs(r.nextInt(1000000000));
                    int b = a + 6 + abs(r.nextInt(1000000000));
                    out.println(a + " " + b);
                }
                else {
                    long a = abs((long)r.nextInt(100000000) * r.nextInt(100000000));
                    long b = a + abs((long)r.nextInt(100000000) * r.nextInt(100000000)) + 6;
                    out.println(a + " " + b);
                }
            }
        }
    }
}
