package InfoTechQuest.simple;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Task7 {

    static String dir = "/home/acid/IdeaProjects/Geekbrains/src/InfoTechQuest/test/simple/task7/";

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
                String [] l = in.nextLine().split(" ");
                BigInteger v1 = new BigInteger(l[0]);
                BigInteger v2 = new BigInteger(l[1]);
                out.println(v1.gcd(v2));
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
                    out.println(abs(r.nextInt()) + " " + abs(r.nextInt()));
                }
                else {
                    out.println(abs(r.nextLong()) + " " + abs(r.nextLong()));
                }
            }
        }
    }
}
