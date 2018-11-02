package InfoTechQuest.simple;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Task8 {

    static String dir = "/home/acid/IdeaProjects/Geekbrains/src/InfoTechQuest/test/simple/task8/";

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
                out.println(0);
            }
        }
    }



    private static void gen(String dir) throws IOException {
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            File file = new File(dir + i);
            boolean f = file.createNewFile();
            try(PrintWriter out = new PrintWriter(file)){
                if(i < 25) {
                    int a = abs(r.nextInt());
                    int b = a + 5 + abs(r.nextInt());
                    out.println(a + " " + b);
                }
                else {
                    long a = abs(r.nextLong());
                    long b = a + 5 + abs(r.nextLong());
                    out.println(a + " " + b);
                }
            }
        }
    }
}
