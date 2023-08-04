package Backjoon;

import java.util.Scanner;

public class BSH_Q17614 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int cnt = 0;

        for(int i=1; i<=n; i++) {
            int num = i;
            while(num>0) {
                int tmp = num / 10;
                if(num%10==3||num%10==6||num%10==9) cnt++;
                num = tmp;
            }
        }
        System.out.print(cnt);
    }
}
/*
20220531
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 30분
*/
