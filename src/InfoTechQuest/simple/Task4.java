package InfoTechQuest.simple;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task4 {

    static String dir = "/home/acid/IdeaProjects/Geekbrains/src/InfoTechQuest/test/simple/task4/";

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
                int a = in.nextInt();
                for (int j = 0; j < a; j++) {
                    for (int k = 0; k <= j; k++) {
                        out.print("[");
                    }
                    for (int k = 0; k <= j; k++) {
                        out.print("]");
                    }
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
                    out.println(r.nextInt(50));
                }
                else if(i < 40){
                    out.println(r.nextInt(100));
                }
                else {
                    out.println(r.nextInt(1000));
                }
            }
        }
    }
}
