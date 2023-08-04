package Backjoon;

import java.util.Scanner;

public class BSH_Q1362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String s = null;

        while(true) {
            boolean die = false;
            double o = sc.nextDouble();
            double w = sc.nextDouble();
            if(o==0 && w==0) break;

            while(true) {
                String c = sc.next();
                int n = sc.nextInt();

                if(c.equals("E")) {w = w - n;}
                else if(c.equals("F")) {w = w + n;}
                
                if(w<=0) die = true;
                else if(w > o * 0.5 && w < 2 * o) s = ":-)";
                else s = ":-(";

                if(c.equals("#") && n==0) break;
            }
            count++;
            if(die) System.out.println(count + " " + "RIP");
            else System.out.println(count + " " + s);
        }
    }
}
/*
20220531
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 30분
*/