package InfoTechQuest.Geometry;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Task3 {

    static String dir = "/home/acid/IdeaProjects/Geekbrains/src/InfoTechQuest/test/task3/";

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
                double d = in.nextDouble(), a = in.nextDouble();
                a = ((90 - (180 - a) / 2) * Math.PI) / 180;
                out.println((long)(d * sin(a) * d * cos(a)));
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
                    out.println(r.nextInt(100) + " " + r.nextInt(90));
                }
                else if(i < 20){
                    out.println(r.nextInt(1000) + " " + r.nextInt(90));
                }
                else if(i < 40){
                    out.println(r.nextInt(1000000) + " " + r.nextInt(90));
                }
                else {
                    out.println(r.nextInt(1000000000) + " " + r.nextInt(90));
                }
            }
        }
    }
}
