package Backjoon;

import java.util.Scanner;

public class B_2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();

        if(m - 45 < 0) {
            m = 60 + (m - 45);
            h--;
            if(h<0) h = 24 + h;
        }else {
            m = m - 45;
        }

        System.out.println(h + " " + m);
    }
}
