package InfoTechQuest.simple;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task15 {

    static String dir = "/home/acid/IdeaProjects/" +
            "Geekbrains/src/InfoTechQuest/test/simple/task15/";

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
                String s1 = in.next(), s2 = in.next();
                String s3 = s2 + s1;
                int [] px = p(s3.toCharArray());
                int shift = px[px.length-1];
                if(shift == 0){
                    out.println("compression error");
                }
                else{
                    out.println(
                            s1.substring(0, s1.length() - shift) + " " +
                                    s1.substring(s1.length() - shift) + " " +
                                    s2.substring(shift)
                    );
                }
            }
        }
    }

    private static int [] p(char [] s){
        int n = s.length;
        int [] pi = new int[n];
        for (int i = 1; i < n; ++i) {
            int j = pi[i-1];
            while (j > 0 && s[i] != s[j])
                j = pi[j-1];
            if (s[i] == s[j])  ++j;
            pi[i] = j;
        }
        return pi;
    }

    private static void gen(String dir) throws IOException {
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            File file = new File(dir + i);
            boolean f = file.createNewFile();
            try(PrintWriter out = new PrintWriter(file)){
                if(i < 10) {
                    int a = 30 + r.nextInt(50);
                    char [] s1 = new char[a];
                    for (int j = 0; j < a; j++) {
                        s1[j] = (char)(r.nextInt(26) + 'A');
                        out.print(s1[j]);
                    }
                    out.print(" ");
                    int b = a / 2;
                    for (int j = b; j < a; j++) {
                        out.print(s1[j]);
                    }
                    int c = 10 + r.nextInt(50);
                    for (int j = 0; j < c; j++) {
                        out.print((char)(r.nextInt(26) + 'A'));
                    }
                    out.print("\n");
                }
                else if(i < 30){
                    int a = 100 + r.nextInt(500);
                    char [] s1 = new char[a];
                    for (int j = 0; j < a; j++) {
                        s1[j] = (char)(r.nextInt(26) + 'A');
                        out.print(s1[j]);
                    }
                    out.print(" ");
                    int b = a / 4;
                    for (int j = a - b; j < a; j++) {
                        out.print(s1[j]);
                    }
                    int c = 100 + r.nextInt(500);
                    for (int j = 0; j < c; j++) {
                        out.print((char)(r.nextInt(26) + 'A'));
                    }
                    out.print("\n");
                }
                else {
                    int a = 1000 + r.nextInt(10000);
                    char [] s1 = new char[a];
                    for (int j = 0; j < a; j++) {
                        s1[j] = (char)(r.nextInt(26) + 'A');
                        out.print(s1[j]);
                    }
                    out.print(" ");
                    int b = a / 4;
                    for (int j = b; j < a; j++) {
                        out.print(s1[j]);
                    }
                    int c = 1000 + r.nextInt(1000);
                    for (int j = 0; j < c; j++) {
                        out.print((char)(r.nextInt(26) + 'A'));
                    }
                    out.print("\n");
                }
            }
        }
    }
}
