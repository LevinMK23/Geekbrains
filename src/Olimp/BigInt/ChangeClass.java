package Olimp.BigInt;

import java.util.*;

/**
 * Created by teacher on 23.09.2018.
 */
public class ChangeClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] d = in.nextLine().split("/");
        int a = Integer.parseInt(d[0]), b = Integer.parseInt(d[1]);
        StringBuilder ans = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        if(a % b == 0) {
            System.out.println(a / b);
            return;
        }
        ans.append(a / b).append('.');
        int len = ans.length() - 1;
        a = a % b;
        int pos = 0, pe = 0;
        while (true){
            a *= 10;
            pos++;
            if(a == 0) {
                break;
            }
            if(map.containsKey(a)){
                pe = map.get(a);
                break;
            }
            else map.put(a, pos);
            ans.append(a / b);
            a = a % b;
        }
        if(pe == 0){
            System.out.println(ans);
        }
        else {
            ans.insert(pe + len, '(');
            ans.append(')');
            System.out.println(ans);
        }
    }
}
