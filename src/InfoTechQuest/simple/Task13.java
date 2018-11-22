package InfoTechQuest.simple;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task13 {

    static String dir = "/home/acid/IdeaProjects/" +
            "Geekbrains/src/InfoTechQuest/test/simple/task13/";

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
                StringBuilder s = new StringBuilder(in.next()),
                        s1 = new StringBuilder(in.next());
                for (int j = 0; j < s.length(); j++) {
                    s.setCharAt(j, (char)((s.charAt(j) + s1.charAt(j % s1.length())) % 26 + 'A'));
                }
                out.println(s);
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
                    int a = 3 + r.nextInt(50);
                    for (int j = 0; j < a; j++) {
                        out.print((char)(r.nextInt(26) + 'A'));
                    }
                    out.print(" ");
                    int b = 3 + r.nextInt(50);
                    for (int j = 0; j < b; j++) {
                        out.print((char)(r.nextInt(26) + 'A'));
                    }
                    out.print("\n");
                }
                else if(i < 30){
                    int a = 3 + r.nextInt(500);
                    for (int j = 0; j < a; j++) {
                        out.print((char)(r.nextInt(26) + 'A'));
                    }
                    out.print(" ");
                    int b = 3 + r.nextInt(50);
                    for (int j = 0; j < b; j++) {
                        out.print((char)(r.nextInt(26) + 'A'));
                    }
                    out.print("\n");
                }
                else {
                    int a = 3 + r.nextInt(10000);
                    for (int j = 0; j < a; j++) {
                        out.print((char)(r.nextInt(26) + 'A'));
                    }
                    out.print(" ");
                    int b = 3 + r.nextInt(10000);
                    for (int j = 0; j < b; j++) {
                        out.print((char)(r.nextInt(26) + 'A'));
                    }
                    out.print("\n");
                }
            }
        }
    }
}
