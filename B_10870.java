package Backjoon;

import java.util.Scanner;

public class B_10870 {
    public static int result = 0;
    public static int N;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        result = fibonachi(N);
        System.out.println(result);

    }
    public static int fibonachi(int n) {
        if(n==0) {
            return 0;
        }else if(n==1) {
            return 1;
        }else {
            return fibonachi(n-1) + fibonachi(n-2);
        }
    }
}
