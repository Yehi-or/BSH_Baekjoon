package Backjoon;

import java.util.Scanner;

public class BSH_Q17618 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;

        for(int i=1; i<=n; i++) {
            int sum = 0;
            int num = i;
            while(num>0) {
                int tmp = num / 10;
                sum += num % 10;
                num = tmp;
            }
            if(i%sum==0) cnt++;
        }
        System.out.print(cnt);
    }
}
/*
20220531
�������ص�:4(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 10��
*/