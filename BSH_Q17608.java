package Backjoon;

import java.util.Scanner;

public class BSH_Q17608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int n = sc.nextInt();
        int stick[] = new int[n];

        for(int i=0; i<n; i++) {
            stick[i] = sc.nextInt();
        }
        int max = stick[n-1];

        for(int i=n-2; i>=0; i--) {
            if(max < stick[i]) {
                max = stick[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
20220531
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 15분
*/