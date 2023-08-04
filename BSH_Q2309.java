package Backjoon;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BSH_Q2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int a1[] = new int[9];
        int a2[] = new int[7];
        int a3[] = new int[7];

        for(int i=0; i<9; i++) {
            a1[i] = sc.nextInt();
        }
        while(true) {
            int sum = 0;
            for(int i=0; i<7; i++) {
                a2[i] = rd.nextInt(9);
                for (int j = 0; j < i; j++) {
                    if (a2[i] == a2[j]) {
                        i--;
                    }
                }
            }
            for(int i=0; i<7; i++){
                a3[i] = a1[a2[i]];
                sum += a1[a2[i]];
            }
            if(sum==100) break;
        }

        Arrays.sort(a3);

        for(int i=0; i<7; i++){
            System.out.println(a3[i]);
        }
    }
}
/*
20220524
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 50분
*/