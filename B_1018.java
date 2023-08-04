package Backjoon;

import java.util.Scanner;

public class B_1018 {
    static char[][] b_start = new char[8][8];
    static char[][] w_start = new char[8][8];
    static char[][] chess;
    static char check;
    static int cnt = 0;
    static int cnt1 = 0;
    static int cnt2 = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                if(i % 2==0 && j % 2 ==0) {
                    b_start[i][j] = 'B';
                    w_start[i][j] = 'W';
                }else if(i % 2==1 && j % 2==1) {
                    b_start[i][j] = 'B';
                    w_start[i][j] = 'W';
                }else {
                    b_start[i][j] = 'W';
                    w_start[i][j] = 'B';
                }
            }
        }
        chess = new char[N][M];

        for(int i=0; i<N; i++) {
            String str = in.next();
            for(int j=0; j<M; j++) {
                chess[i][j] = str.charAt(j);
            }
        }
        int range_x = N - 8;
        int range_y = M - 8;

        int min = 64;

        for(int i=0; i<=range_x; i++) {
            for(int j=0; j<=range_y; j++) {
                if(compare(i, j) <= min) {
                    min = compare(i, j);
                }
            }
        }
        System.out.println(min);
    }
    static int compare(int x, int y) {
        cnt=0;
        cnt1=0;
        cnt2=0;
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                check = chess[x + i][y + j];
                if(chess[x][y]=='B') {
                    if(b_start[i][j] != check) {
                        cnt1++;
                    }
                    if(w_start[i][j] != check) {
                        cnt2++;
                    }
                }else if(chess[x][y]=='W') {
                    if(w_start[i][j] != check) {
                        cnt1++;
                    }
                    if(b_start[i][j] != check) {
                        cnt2++;
                    }
                }
            }
        }
        if(cnt1 < cnt2) {
            cnt = cnt1;
        }else {
            cnt = cnt2;
        }
        return cnt;
    }
}
//2023-03-08
