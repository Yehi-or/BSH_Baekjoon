package Backjoon;

import java.util.Scanner;

public class B_25501 {
    public static int cnt = 0;
    public static int recursion(String s, int l, int r) {
        cnt++;
        if( l>=r ) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        String[] arr = new String[N];

        for(int i=0; i<N; i++) {
            arr[i] = in.next();
        }

        for(int i=0; i<N; i++) {
            System.out.print(isPalindrome(arr[i]) + " " + cnt);
            cnt = 0;
            System.out.println();
        }
    }
}
