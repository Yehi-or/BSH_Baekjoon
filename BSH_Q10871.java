package Backjoon;

import java.util.Scanner;

public class BSH_Q10871 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();

        for(int i=0; i<n; i++) {
            int a = in.nextInt();
            if(a < x) System.out.print(a + " ");
        }
    }
}
