package InfoTechQuest.simple;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Task12 {

    static String dir = "/home/acid/IdeaProjects/" +
            "Geekbrains/src/InfoTechQuest/test/simple/task12/";

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
                StringBuilder s = new StringBuilder(in.next()); int n = in.nextInt();
                char [] a = new char[26];
                for(int j = 0; j < 26; j++) a[j] = (char)('A' + j);
                for (int j = 0; j < s.length(); j++) {
                    s.setCharAt(j, (s.charAt(j) - 'A' + n) > 0 ?
                            a[(s.charAt(j) - 'A' + n) % 26] :
                            a[26 - abs(n) % 26]);
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
                    out.println(" " + (1 + r.nextInt(10)));
                }
                else if(i < 30){
                    int a = 3 + r.nextInt(5000);
                    for (int j = 0; j < a; j++) {
                        out.print((char)(r.nextInt(26) + 'A'));
                    }
                    out.println(" " + (1 + r.nextInt(100)));
                }
                else {
                    int a = 3 + r.nextInt(10000);
                    for (int j = 0; j < a; j++) {
                        out.print((char)(r.nextInt(26) + 'A'));
                    }
                    out.println(" " + r.nextInt());
                }
            }
        }
    }
}
