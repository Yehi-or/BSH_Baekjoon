package Backjoon;

import java.util.Scanner;

public class B_2566 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //9 * 9 �� 2���� �迭�� ������
        int[][] arr = new int[9][9];
        //�ִ�, �ִ��� i(��) �ε��� ��, �ִ��� j(��) �ε��� ��
        int max = 0;
        int idx_i = 0;
        int idx_j = 0;

        //���� �����Ѵ�.
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        //���� ������ �迭�� ���� max ���� ũ�ٸ� max, �� index, �� index �� �����Ѵ�.
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    idx_i = i;
                    idx_j = j;
                }
            }
        }
        //���
        System.out.println(max);
        System.out.print((idx_i + 1) + " " + (idx_j + 1));

    }
}
//2023-02-08 11:15
