package Backjoon;

import java.util.Scanner;

public class B_2292 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int cnt = 1;
        int range = 2;
        if(n==1) {
            System.out.println(1);
        }else {
            while(n >= range) {
                range = range + (6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }
    }

}
