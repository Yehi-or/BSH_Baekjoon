package Backjoon;

import java.util.Scanner;

public class B_2908 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String f = in.next();
        int farr[] = new int[f.length()];
        String s = in.next();
        int sarr[] = new int[s.length()];

        for(int i=0; i<f.length(); i++) {
            farr[i] = Integer.parseInt(String.valueOf(f.charAt(i)));
        }

        for(int i=0; i<s.length(); i++) {
            sarr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        int first = farr[2] * 100 + farr[1] * 10 + farr[0];
        int second = sarr[2] * 100 + sarr[1] * 10 + sarr[0];

        if(first > second) System.out.println(first);
        else if (second > first) System.out.println(second);

    }
}
