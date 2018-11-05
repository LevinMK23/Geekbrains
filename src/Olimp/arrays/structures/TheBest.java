package Olimp.arrays.structures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TheBest {

    static class User{

        int pos;
        String name;
        ArrayList<Integer> marks;
        int sum = 0;
        double avg = 0.;

        public User(String name, String [] m, int pos) {
            this.name = name;
            this.pos = pos;
            marks = new ArrayList<>();
            for (String s : m){
                marks.add(Integer.valueOf(s));
            }
            for (Integer i : marks){
                sum += i;
            }
            avg = (double)sum / marks.size();
        }

        String getMarks(){
            StringBuilder sb = new StringBuilder();
            for (Integer i : marks){
                sb.append(i).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            return String.valueOf(sb);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", avg=" + avg +
                    '}';
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        in.nextLine();
        ArrayList<User> list = new ArrayList<>();
        ArrayList<User> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new
                    User(in.nextLine(), in.nextLine().split(" "), i));
        }
        list.sort(Comparator.comparingDouble(o->-o.avg));
        int cnt = 3;
        boolean running = true;
        while(running){
            for (int i = 0; i < list.size(); i++) {
                ans.add(list.get(i));
                cnt--;
                if(i == n-1 || (cnt <= 0 && list.get(i).avg > list.get(i+1).avg)) {
                    running = false;
                    break;
                }
            }
        }
        ans.sort(Comparator.comparingInt(o->o.pos));
        for (User i : ans)
            System.out.println(i.name +
                        " (" + i.getMarks() + ")");
    }
}
