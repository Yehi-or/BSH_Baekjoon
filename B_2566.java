package Backjoon;

import java.util.Scanner;

public class B_2566 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //9 * 9 의 2차원 배열이 정해짐
        int[][] arr = new int[9][9];
        //최댓값, 최댓값의 i(열) 인덱스 값, 최댓값의 j(행) 인덱스 값
        int max = 0;
        int idx_i = 0;
        int idx_j = 0;

        //값을 대입한다.
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        //만약 각각의 배열의 값이 max 보다 크다면 max, 행 index, 열 index 를 변경한다.
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    idx_i = i;
                    idx_j = j;
                }
            }
        }
        //출력
        System.out.println(max);
        System.out.print((idx_i + 1) + " " + (idx_j + 1));

    }
}
//2023-02-08 11:15
