package Olimp.arrays.structures;

import java.util.HashMap;
import java.util.Scanner;

public class TelephoneBase {

    static class User{
        int number;
        String fio, address;

        public User(int number, String fio, String address) {
            this.number = number;
            this.fio = fio;
            this.address = address;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        in.nextLine();
        HashMap<Integer, User> base = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(in.nextLine());
            String fio = in.nextLine();
            String address = in.nextLine();
            base.put(num, new User(num, fio, address));
        }
        for (int i = 0; i < m; i++) {
            int query = Integer.parseInt(in.nextLine());
            System.out.println(base.get(query).fio +
                    " (" + base.get(query).address + ")");
        }
    }
}
