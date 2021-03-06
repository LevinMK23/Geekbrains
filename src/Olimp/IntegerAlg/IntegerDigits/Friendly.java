package Olimp.IntegerAlg.IntegerDigits;

import java.util.Scanner;

public class Friendly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int [][] d = {
                {220, 284},
                { 1184,  1210 },
                {2620 , 2924 },
                {5020  ,5564 },
                {6232  ,6368 },
                {10744 , 10856 },
                {12285, 14595 },
                {17296 ,18416  },
                {63020  ,76084 },
                {66928,  66992},
                {67095,  71145 },
                {69615,  87633 },
                {79750,  88730 },
                {100485, 124155},
                {122265,  139815},
                {122368,  123152},
                {141664,  153176},
                {142310,  168730},
                {171856,  176336},
                {176272,  180848},
                {185368,  203432},
                {196724,  202444},
                {280540,  365084},
                {308620,  389924},
                {319550,  430402},
                {356408,  399592},
                {437456,  455344},
                {469028,  486178},
                {503056,  514736},
                {522405,  525915},
                {600392,  669688},
                {609928,  686072},
                {624184,  691256},
                {635624,  712216},
                {643336,  652664},
                {667964,  783556},
                {726104,  796696},
                {802725,  863835},
                {879712,  901424},
                {898216,  980984},
                {998104,  1043096}
        };
        int co = 0;
        for (int i = 0; i < d.length; i++) {
            if(d[i][0] >= n && d[i][1] <= m){
                System.out.println(d[i][0] + " " + d[i][1]);
                co++;
            }
        }
        if(co == 0) System.out.println("Absent");
    }
}
