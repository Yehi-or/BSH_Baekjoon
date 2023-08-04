package Backjoon;

import java.util.Scanner;

public class B_1934 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i=0; i<N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            int gcd = gcd(a, b);
            int lcm = gcd * (a / gcd) * (b / gcd);
            System.out.println(lcm);
        }
    }
    public static int gcd(int a, int b) {

        while(b!=0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}
