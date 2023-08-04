package Backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class BSH_Q2605_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList al = new ArrayList();

        for(int i=0; i<n; i++) {
            al.add(sc.nextInt(), i+1);
        }

        for(int i=n-1; i>=0; i--) {
            System.out.print(al.get(i) + " ");
        }
    }
}
