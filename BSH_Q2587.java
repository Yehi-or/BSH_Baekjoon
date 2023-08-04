package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BSH_Q2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s[] = new int[5];
        int sum = 0;

        for(int i=0; i<5; i++) {
            s[i] = sc.nextInt();
            sum += s[i];
        }
        Arrays.sort(s);
        int avg = sum / 5;

        System.out.println(avg);
        System.out.println(s[2]);
    }
}
/*
20220524
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 3분
*/