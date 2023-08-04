package Backjoon;

import java.util.Scanner;

public class B_2941 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        java.lang.String s = in.next();

        int cnt = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='c') {
                if(i+1<s.length()) {
                    if (s.charAt(i + 1) == '=') i += 1;
                    else if (s.charAt(i + 1) == '-') i += 1;
                }
            } else if(s.charAt(i)=='d') {
                if(i+1<s.length()) {
                    if (s.charAt(i + 1) == 'z') {
                        if(i+2<s.length()) {
                            if (s.charAt(i + 2) == '=') i += 2;
                        }
                    } else if (s.charAt(i + 1) == '-') i += 1;
                }
            } else if(s.charAt(i)=='l') {
                if(i+1<s.length()) {
                    if (s.charAt(i + 1) == 'j') i += 1;
                }
            } else if(s.charAt(i)=='n') {
                if(i+1<s.length()) {
                    if (s.charAt(i + 1) == 'j') i += 1;
                }
            } else if(s.charAt(i)=='s') {
                if(i+1<s.length()) {
                    if (s.charAt(i + 1) == '=') i += 1;
                }
            } else if(s.charAt(i)=='z') {
                if(i+1<s.length()) {
                    if (s.charAt(i + 1) == '=') i += 1;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
