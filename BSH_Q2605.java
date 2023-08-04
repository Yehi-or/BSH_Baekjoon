package Backjoon;

import java.util.Scanner;

public class BSH_Q2605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_student = sc.nextInt();
        int s[] = new int[num_of_student];

        for(int i=0; i<num_of_student; i++)
            s[i] = i+1;

        for(int i=0; i<num_of_student; i++) {
            int n = sc.nextInt();
            int num = s[i];
            int cnt = 0;
            for(int j=0; j<n; j++){
                s[i-cnt] = s[i-1-cnt];
                cnt++;
                if(i-cnt==0) break;
            }
            if(i>0)
                s[i-n] = num;
        }
        for(int i=0; i<num_of_student; i++) System.out.print(s[i] + " ");
    }
}
/*
20220524
문제이해도:3(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 1시간
*/