package Backjoon;

import java.util.Scanner;

public class B_2738 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[][] a_arr = new int[N][M];
        int[][] b_arr = new int[N][M];

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                a_arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                b_arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(a_arr[i][j] + b_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
