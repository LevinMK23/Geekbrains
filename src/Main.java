import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by teacher on 23.09.2018.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String line;
        boolean f = false;
        LinkedList<String> list = new LinkedList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            line = in.readLine();
            if(!line.equals("next")){
                if(map.containsKey(line)) {
                    map.put(line, map.get(line) + 1);
                    System.out.println("2st " + line);
                }
                else {
                    System.out.println("1st " + line);
                    list.addLast(line);
                    map.put(line, 1);
                }
                if(map.get(line) == 2){
                    list.set(list.indexOf(line), line + " " + line);
                    map.put(line, 0);
                }
            }
            if(f && !list.isEmpty() && !list.peekFirst().equals(line)){
                f = false;
                System.out.println(Arrays.toString(Objects.requireNonNull(list.pollFirst()).split(" ")));
            }
            if(line.equals("next")){
                if (list.isEmpty() || list.peekFirst().equals(line)){
                   f = true;
                }
                else {
                    System.out.println(Arrays.toString(Objects.requireNonNull(list.pollFirst()).split(" ")));
                }
            }
        }
    }

}