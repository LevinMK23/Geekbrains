package Olimp.sort.sort1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class WorkTime {
    public static void main(String[] args) {
        new WorkTime().run();
    }

    Scanner in;
    PrintWriter out;

    void solve() {
        int n = Integer.parseInt(in.nextLine());
        SimpleDateFormat f = new SimpleDateFormat("dd.MM. HH:mm");
        ArrayList<Date> dates = new ArrayList<>(n);
        try {
            for (int i = 0; i < n; i++) {
                dates.add(f.parse(in.nextLine()));
            }
        } catch (ParseException e) {
            throw new Error(e);
        }
        Collections.sort(dates);
        long result = 0;
        long delta = 16 * 60 * 60 * 1000;
        for (int i = 0; i < n; i += 2) {
            Calendar d1 = Calendar.getInstance();
            Calendar d2 = Calendar.getInstance();
            d1.setTime(dates.get(i));
            d2.setTime(dates.get(i + 1));
            long k = 0;
            Calendar d3 = (Calendar) d1.clone();
            while (d3.get(Calendar.DAY_OF_YEAR) != d2.get(Calendar.DAY_OF_YEAR)) {
                d3.add(Calendar.DATE, 1);
                k++;
            }
            result += 60000 + d2.getTimeInMillis() - d1.getTimeInMillis()
                    - (k * delta);
        }
        long min = result / 60000;
        out.printf("%d:%02d", min / 60, min % 60);
    }

    void run() {
        in = new Scanner(System.in);
        out = new PrintWriter(System.out);
        try {
            solve();
        } finally {
            out.close();
        }
    }

}