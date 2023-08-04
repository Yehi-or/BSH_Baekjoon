package Backjoon;

import java.util.Scanner;

public class B_1463 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int start_num = 666;
        int cnt = 0;

        while(cnt < N) {
            if(String.valueOf(start_num).contains("666")) {
                cnt++;
                if(cnt==N) {
                    System.out.println(start_num);
                    break;
                }
            }
            start_num++;
        }
    }
}
