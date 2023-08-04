package Backjoon;

import java.util.Scanner;

public class B_2563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int size = 0;

        boolean [][] arr = new boolean[101][101];

        for(int i=0; i<N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            for(int j=x; j<x+10; j++) {
                for(int k=y; k<y+10; k++) {
                    if(!arr[j][k]) {
                        arr[j][k] = true;
                        size++;
                    }
                }
            }
        }
        System.out.println(size);
    }
}
