package Olimp.Hack;

import java.io.File;
import java.io.FileNotFoundException;

public class HackACMP {
    static class DirException extends Error {
        File [] data;
        public DirException(File [] data) {
            super();
            this.data = data;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for(File file : data) sb.append(file.getAbsolutePath()).append("\n");
            return sb.toString();
        }




        @Override
        public void printStackTrace() {
            System.out.println(data);
            super.printStackTrace();
        }
    }
    public static void main(String[] args) throws FileNotFoundException, DirException {
        showData(new File("/"), "");
    }

    private static void showData(File dir, String s) throws FileNotFoundException, DirException {
        if(dir.isFile()){
            System.err.println(s + "file : " + dir);
            return;
        }
        if (dir.exists()) {
            File[] files = dir.listFiles();
            if(files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        throw new DirException(files);
                    } else if (file.exists()) showData(file, s + "--");
                    else return;
                }
            }
        }
    }
}
