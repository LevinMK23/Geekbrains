package InfoTechQuest.simple;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    static String dir = "/home/acid/IdeaProjects/Geekbrains/src/InfoTechQuest/test/simple/task2/";

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
                out.println(a / b + " " + a % b);
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
                }
                else if(i < 20){
                    out.println(r.nextInt(1000) + " " + r.nextInt(1000));
                }
                else if(i < 40){
                    out.println(r.nextInt(1000000000) + " " + r.nextInt(1000000000));
                }
                else {
                    out.println((long)r.nextInt(1000000000) * r.nextInt(1000000000)  + " "
                            + (long)r.nextInt(1000000000) * r.nextInt(1000000000));
                }
            }
        }
    }
}
