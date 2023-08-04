package Backjoon;

import java.util.Scanner;

public class B_1085 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];

        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        arr[0] = x;
        arr[1] = y;
        arr[2] = h - y;
        arr[3] = w - x;
//        for(int i=0; i<4; i++) {
//            System.out.print(arr[i] + " ");
//        }

        int min = arr[0];

        for(int i=1; i<4; i++) {
            if(arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
