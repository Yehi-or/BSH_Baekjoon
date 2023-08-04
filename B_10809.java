package Backjoon;

import java.util.Scanner;

public class B_10809 {
    public static void main(String[] args) {
        int arr[] = new int[26];

        for(int i=0; i<arr.length; i++ ) {
            arr[i] = -1;
        }
        Scanner in = new Scanner(System.in);
        String s = in.next();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for(int value : arr) {
            System.out.print(value + " ");
        }
    }
}
