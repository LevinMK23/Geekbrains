package InfoTechQuest.simple;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task14 {

    static String dir = "/home/acid/IdeaProjects/" +
            "Geekbrains/src/InfoTechQuest/test/simple/task14/";

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
                int n = in.nextInt(), m = in.nextInt();
                long [][] a = new long[m+1][n+1], d = new long[m+1][n+1];
                for (int j = 1; j <= m; j++) {
                    for (int k = 1; k <= n; k++) {
                        a[j][k] = in.nextLong();
                        d[j][k] = a[j][k];
                    }
                }
                for (int j = 1; j <= m; j++) {
                    for (int k = 1; k <= n; k++) {
                        d[j][k] = Long.max(d[j-1][k], d[j][k-1]) + a[j][k];
                    }
                }
                out.println(d[m][n]);
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
                    int n = 3 + r.nextInt(100), m = 3 + r.nextInt(100);
                    out.println(n + " " + m);
                    for (int j = 0; j < m; j++) {
                        for (int k = 0; k < n; k++) {
                            out.print(r.nextInt(100) + " ");
                        }
                        out.println();
                    }
                }
                else if(i < 20){
                    int n = 3 + r.nextInt(500), m = 3 + r.nextInt(500);
                    out.println(n + " " + m);
                    for (int j = 0; j < m; j++) {
                        for (int k = 0; k < n; k++) {
                            out.print(r.nextInt(100) + " ");
                        }
                        out.println();
                    }
                }
                else if(i < 30){
                    int n = 3 + r.nextInt(500), m = 3 + r.nextInt(500);
                    out.println(n + " " + m);
                    for (int j = 0; j < m; j++) {
                        for (int k = 0; k < n; k++) {
                            out.print(r.nextInt(1000) + " ");
                        }
                        out.println();
                    }
                }
                else if(i < 40){
                    int n = 3 + r.nextInt(1000), m = 3 + r.nextInt(1000);
                    out.println(n + " " + m);
                    for (int j = 0; j < m; j++) {
                        for (int k = 0; k < n; k++) {
                            out.print(r.nextInt(10000) + " ");
                        }
                        out.println();
                    }
                }
                else {
                    int n = 3 + r.nextInt(1000), m = 3 + r.nextInt(1000);
                    out.println(n + " " + m);
                    for (int j = 0; j < m; j++) {
                        for (int k = 0; k < n; k++) {
                            out.print(r.nextInt(10000) + " ");
                        }
                        out.println();
                    }
                }
            }
        }
    }
}
