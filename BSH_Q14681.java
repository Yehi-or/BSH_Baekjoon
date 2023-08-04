package Backjoon;

import java.util.Scanner;

public class BSH_Q14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>0 && y>0) System.out.println(1);
        else if (x>0 && y<0) System.out.println(4);
        else if (x<0 && y>0) System.out.println(2);
        else if (x<0 && y<0) System.out.println(3);
    }
}
/*
20220521
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 3분
*/
