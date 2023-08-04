package Backjoon;

import java.util.Scanner;

public class BSH_Q2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        int value = n1 * n2 * n3;
        int sum = 0;

        String str = Integer.toString(value);

        for(int i=0; i<10; i++) {
            int count = 0;
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) - '0' == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
