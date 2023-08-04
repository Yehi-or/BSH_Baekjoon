package Backjoon;

import java.util.Scanner;

public class BSH_Q2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n>=1 && n<=9) {
            for(int i=1; i<=9; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        }
    }
}
