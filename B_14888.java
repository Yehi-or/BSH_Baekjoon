package Backjoon;

import java.util.Scanner;

public class B_14888 {
    public static int[] arr;
    public static int N;
    public static int sums = 0;
    public static int max = -1_000_000_000;
    public static int min = 1_000_000_000;
    public static int[] cal_cnt = new int[4];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }

        for(int i=0; i<4; i++) {
            cal_cnt[i] = in.nextInt();
        }

        dfs(arr[0], 0);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int sum, int deapth) {

        if(deapth==N-1) {
            if(sums < min) {
                min = sums;
            }

            if(sums > max) {
                max = sums;
            }

            return;
        }

        for(int i=0; i<4; i++) {
            if(cal_cnt[i] != 0) {

                switch(i) {
                    case 0 : sums = plus(sum, arr[deapth + 1]); break;
                    case 1 : sums = minus(sum, arr[deapth + 1]); break;
                    case 2 : sums = multi(sum, arr[deapth + 1]); break;
                    case 3 : sums = divide(sum, arr[deapth + 1]); break;
                }

                cal_cnt[i]--;
                dfs(sums, deapth + 1);
                cal_cnt[i]++;
            }
        }

    }
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if(a < 0) {
            a = a * -1;
            return (a / b) * -1;
        }else {
            return a / b;
        }
    }
}
