package Backjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class B_1152 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        String []arr = new String[st.countTokens()];

        for(int i=0; i<arr.length; i++) {
            arr[i] = st.nextToken();
        }
        System.out.println(arr.length);
    }
}
