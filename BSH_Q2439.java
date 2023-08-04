package Backjoon;

import java.util.Scanner;

public class BSH_Q2439 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int cnt = n-1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j>=cnt) System.out.print("*");
                else System.out.print(" ");
            }
            cnt--;
            System.out.println("");
        }
    }
}
