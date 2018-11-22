package Olimp.NTI.try3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Mapping {

    static class Node implements Comparable<Node>{

        String first;
        Integer second;

        public Node(String first, Integer second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Node node) {
            if(-this.second + node.second != 0)
                return node.second - this.second;
            else return this.first.compareTo(node.first);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("/home/acid/Рабочий стол/dataset_168665_9.txt"));
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Node> list = new ArrayList<>();
        String tmp;
        while(in.hasNextLine()){
            String [] data = in.nextLine().split("[^A-Za-z]");
            for (String s : data){
                tmp = s.toLowerCase();
                if (!tmp.isEmpty()) {
                    if (map.containsKey(tmp)) {
                        map.put(tmp, map.get(tmp) + 1);
                    } else {
                        map.put(tmp, 1);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(new Node(entry.getKey(), entry.getValue()));
        }
        Collections.sort(list);
        try (PrintWriter out = new PrintWriter(
                new File("/home/acid/Рабочий стол/out.txt"))){
            for (Node node : list){
                out.println(node.first + " " + node.second);
            }
        }
    }
}
