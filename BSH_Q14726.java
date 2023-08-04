package Backjoon;

import java.util.Scanner;

public class BSH_Q14726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            long num = sc.nextLong();
            long s[] = new long[16];
            for (int j = 0; j < 16; j++) {
                s[j] = num % 10;
                num = num / 10;
            }
            long sum1 = 0, sum2 = 0, sum3 = 0;
            for(int k=0; k<16; k++) {
                long n1 = s[k] * 2;
                if(k%2!=0) {
                    if (n1 < 10) {sum1 += n1;}
                    else if (n1 >= 10) {sum2 += (n1 % 10) + 1;}
                }else
                    sum3 += s[k];
            }
            if((sum1 + sum2 + sum3) % 10 == 0)
                System.out.println("T");
            else
                System.out.println("F");
        }
    }
}
/*
20220531
문제이해도:3(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 40분
*/
