package InfoTechQuest.simple;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task6 {

    static String dir = "/home/acid/IdeaProjects/Geekbrains/src/InfoTechQuest/test/simple/task6/";

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
                int n = in.nextInt();
                int [] a = new int[n], v = new int[n];
                for (int j = 0; j < n; j++) {
                    a[j] = in.nextInt();
                }
                int pos1 = -1, pos2 = -1, max = Integer.MIN_VALUE, max1 = Integer.MIN_VALUE, cnt = 0;
                for (int j = 1; j < n-1; j++) {
                    if(a[j] > a[j-1] && a[j] > a[j+1]){
                        if (a[j] >= max){
                            max = a[j];
                            pos1 = j;
                            cnt = 1;
                        }
                    }
                }
                if(cnt == 1) v[pos1] = 1;
                for (int j = 1; j < n-1; j++) {
                    if(a[j] > a[j-1] && a[j] > a[j+1] && v[j] != 1){
                        if (a[j] >= max1){
                            max1 = a[j];
                            pos2 = j;
                            cnt = 2;
                        }
                    }
                }
                if(cnt != 2){
                    out.println("impossible");
                }
                else {
                    int buf1, buf2;
                    if(pos1 < pos2){
                        buf1 = pos1;
                        buf2 = max;
                        max = max1;
                        pos1 = pos2;
                        max1 = buf2;
                        pos2 = buf1;
                    }
                    out.printf("mountain %d : %d m\n", pos2+1, max1);
                    out.printf("mountain %d : %d m\n", pos1+1, max);
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
                if(i < 10) {
                    int n = r.nextInt(100);
                    out.println(n);
                    for (int j = 0; j < n; j++) {
                        out.print(r.nextInt(100) + " ");
                    }
                    out.println();
                }
                else if(i < 20){
                    int n = r.nextInt(1000);
                    out.println(n);
                    for (int j = 0; j < n; j++) {
                        out.print(r.nextInt(1000) + " ");
                    }
                    out.println();
                }
                else if(i < 40){
                    int n = r.nextInt(10000);
                    out.println(n);
                    for (int j = 0; j < n; j++) {
                        out.print(r.nextInt(10) + " ");
                    }
                    out.println();
                }
                else {
                    int n = r.nextInt(100000);
                    out.println(n);
                    for (int j = 0; j < n; j++) {
                        out.print(r.nextInt() + " ");
                    }
                    out.println();
                }
            }
        }
    }
}
