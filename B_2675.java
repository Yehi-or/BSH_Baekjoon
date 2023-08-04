package Backjoon;

import java.util.Scanner;

public class B_2675 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++) {
            int r = in.nextInt();
            String s = in.next();

            for(int j=0; j<s.length(); j++) {
                for( int k=0; k<r; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println("");
        }
    }
}
