package Backjoon;

import java.util.Scanner;

public class B_2580 {
//    public static int[][] arr = new int[9][9];
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        for(int i=0; i<9; i++) {
//            for(int j=0; j<9; j++) {
//                arr[i][j] = in.nextInt();
//            }
//        }
//
//        for(int i=0; i<9; i++) {
//            for(int j=0; j<9; j++) {
//                if(arr[i][j]==0) {
//                    dfs(i, j);
//                }
//            }
//        }
//
//        for(int i=0; i<9; i++) {
//            for(int j=0; j<9; j++) {
//                if(j<8) {
//                    System.out.print(arr[i][j] + " ");
//                }else{
//                    System.out.print(arr[i][j]);
//                }
//            }
//            if(i<8) {
//                System.out.println();
//            }
//        }
//        System.exit(0);
//    }
//    //3번의 if 3라인에서 중복이 안되는 부분을 찾아서 값을 넣음
//    public static void dfs(int c, int r) {
//        for(int i=1; i<=9; i++) {
//            if(possible(c, r, i)) {
//                arr[c][r] = i;
//            }
//        }
//    }
//    public static boolean possible(int c, int r, int num) {
//        for(int i=0; i<9; i++) {
//            if(arr[c][i] == num) {
//                return false;
//            }
//        }
//
//        for(int i=0; i<9; i++) {
//            if(arr[i][r] == num) {
//                return false;
//            }
//        }
//
//        int r_c = (c / 3) * 3;
//        int r_r = (r / 3) * 3;
//
//        for (int i = r_c; i < r_c + 3; i++) {
//            for (int j = r_r; j < r_r + 3; j++) {
//                if (arr[i][j] == num) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
    //틀린 답 한 숫자에 한개씩만 넣어서 틀린듯???
public static int[][] arr = new int[9][9];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }
    public static void sdoku(int r, int c) {
        if(r==9) {
            for(int i=0; i<9; i++) {
                for(int j=0; j<9; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        if(c==9) {
            sdoku(r + 1, 0);
        }

        if(arr[r][c]==0) {
            for(int i=1; i<=9; i++) {
                if(check(r, c, i)) {
                    sdoku(r, c + 1);
                }
            }
        }else {
            sdoku(r, c + 1);
        }
    }

    public static boolean check(int r, int c, int ch) {
        for(int i=0; i<9; i++) {
            if(arr[r][i]==ch) {
                return false;
            }
        }

        for(int i=0; i<9; i++) {
            if(arr[i][r]==ch) {
                return false;
            }
        }

        int r_range = (r / 3) * 3;
        int c_range = (c / 3) * 3;

        for(int i=r_range; i<r_range + 3; i++) {
            for(int j=c_range; j<c_range + 3; j++) {
                if(arr[i][j]==ch) {
                    return false;
                }
            }
        }
        return true;
    }
}
