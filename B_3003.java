package Backjoon;

import java.util.Scanner;

public class B_3003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ki = 1, qu = 1, lo = 2, bi = 2, ni = 2, ph = 8;
        int k = in.nextInt();
        int q = in.nextInt();
        int l = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int p = in.nextInt();

        System.out.println((ki - k) + " " + (qu - q) + " " + (lo - l) + " " + (bi - b) + " " + (ni - n) + " " + (ph - p));
    }
}
