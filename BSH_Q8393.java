package Backjoon;

import java.util.Scanner;

public class BSH_Q8393 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int n = in.nextInt();

        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
