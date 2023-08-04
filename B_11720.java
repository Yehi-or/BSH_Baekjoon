package Backjoon;

import java.util.Scanner;

public class B_11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        String s = in.next();
        int s_num = 0;

        for(int i=0; i<s.length(); i++) {
            s_num += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(s_num);
    }
}
