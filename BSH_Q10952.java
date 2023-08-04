package Backjoon;

import java.util.Scanner;

public class BSH_Q10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n1==0 && n2 ==0) break;
            System.out.println(n1 + n2);
        }
    }
}
/*
20220521
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 4분
*/