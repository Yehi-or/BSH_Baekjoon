package Backjoon;

import java.util.Scanner;

public class B_1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.next();
        String s2 = s1.toLowerCase();

        char arr[] = new char[s2.length()];
        int check[] = new int[26];

        for(int i=0; i<check.length; i++) {
            check[i] = 0;
        }
        for(int i=0; i<arr.length; i++) {
            arr[i] = s2.charAt(i);
        }
        int max_cnt = 0;
        char ch = 'a';

        for(int i=0; i<arr.length; i++) {
            int cnt = 1;
            if (check[arr[i] - 'a'] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) cnt++;
                }
                check[arr[i] - 'a'] = cnt;
                if(cnt > max_cnt) {
                    max_cnt = cnt;
                    ch = arr[i];
                }else if(cnt == max_cnt) {
                    ch = '?';
                }
            }
        }
        if(ch!='?') {
            System.out.println(Character.toUpperCase(ch));
        }else
            System.out.println(ch);
    }
}
