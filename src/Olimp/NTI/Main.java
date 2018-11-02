package Olimp.NTI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    static class Node{
        String name;
        int num;

        public Node(String name, int num) {
            this.name = name;
            this.num = num;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        LinkedList<Node> queue = new LinkedList<>();
        int n = Integer.parseInt(in.readLine());
        boolean flag = false;
        int cnt = 0, p = 0;
        String s;
        for (int i = 0; i < n; i++) {
            if(flag){
                if (!queue.isEmpty()){
                    System.out.println(queue.peekFirst().name);
                    queue.pollFirst();
                    flag = false;
                }
            }
            s = in.readLine();
            if(s.equals("next")){
                if (!queue.isEmpty()){
                    System.out.println(queue.peekFirst().name);
                    queue.pollFirst();
                    flag = false;
                }
                else flag = true;
            }
            else{
                if(map.containsKey(s)){
                    System.out.println("2nd " + s);
                    if (flag){
                        System.out.println(s);
                        map.remove(s);
                        flag = false;
                    }
                    else {
                        if (queue.isEmpty()){
                            queue.addLast(new Node(s, map.get(s)));
                            map.remove(s);
                        }
                        else {
                            if (map.get(s) < queue.peekFirst().num){
                                queue.addFirst(new Node(s, map.get(s)));
                                map.remove(s);
                            }
                            else {
                                if (queue.peekLast().num < map.get(s)){
                                    queue.addLast(new Node(s, map.get(s)));
                                    map.remove(s);
                                }
                                else {
                                    for (int j = 0; j < queue.size(); j++) {
                                        if (queue.get(j).num > map.get(s)) {
                                            queue.add(j, new Node(s, map.get(s)));
                                            map.remove(s);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else{
                    map.put(s, cnt++);
                    System.out.println("1st " + s);
                }
            }
        }
    }
}