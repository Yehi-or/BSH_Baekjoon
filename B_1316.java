package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_1316 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        boolean[] check = new boolean[26];
        boolean[] groupCheck = new boolean[num];
        for(int i=0; i<num; i++) {
            groupCheck[i] = true;
        }
        int count = 0;

        for(int i=0; i<num; i++) {
            String s = in.next();
            char[] ch = new char[s.length()];
            Arrays.fill(check, false);
            boolean b = true;
            int prev = 0;

            for(int j=0; j<s.length(); j++) {
                ch[j] = s.charAt(j);
                int now = ch[j] - 'a';
                if(prev != now) {
                    if(!check[now]) {
                        prev = now;
                        check[prev] = true;
                    }else {
                        b = false;
                        break;
                    }
                }else {
                    check[now] = true;
                    continue;
                }
            }
            if(!b) {
                groupCheck[i] = false;
            }
        }
        for(int i=0; i<num; i++) {
            if(groupCheck[i]) count++;
        }
        System.out.println(count);
    }
}
