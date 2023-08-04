package Backjoon;

import java.util.Scanner;

public class B_10872 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int result = 1;
        int N = in.nextInt();

        for(int i=1; i<=N; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
