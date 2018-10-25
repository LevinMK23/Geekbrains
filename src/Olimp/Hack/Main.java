package Olimp.Hack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File("/home/stepic/instances/master-plugins/arena/");
        showData(dir, "");
    }

    private static void showData(File dir, String s) throws FileNotFoundException {
        System.out.println(s + dir);
        File [] files = dir.listFiles();
        assert files != null;
        for (File file : files){
            if (file.isFile()){
                System.out.println(s + file);
                System.out.println("=====================" +
                                    "======================" +
                                    "======================" +
                                    "=======================");
                Scanner in = new Scanner(file);
                while(in.hasNextLine()){
                    System.out.println(s + in.nextLine());
                }
            }
            else showData(file, s + "--");
        }
    }
}
