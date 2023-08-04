package Backjoon;

import java.util.Scanner;

public class BSH_Q4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        for(int i=0; i<num1; i++) {
            int num2 = sc.nextInt();
            int s[] = new int[num2];

            int sum = 0;
            double avg = 0;
            int count = 0;

            for (int j = 0; j < s.length; j++) {
                s[j] = sc.nextInt();
                sum += s[j];
            }

            avg = (double)sum / s.length;

            for (int k = 0; k < s.length; k++) {
                if (s[k] > avg) count++;
            }
            double num3 = (double)count / s.length * 100;

            System.out.printf("%.3f", num3);
            System.out.println("%");
        }
    }
}
/*
20220521
문제이해도:3(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 35분
*/
