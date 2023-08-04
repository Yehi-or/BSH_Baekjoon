package Backjoon;

import java.util.Scanner;

public class B_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + hansu(i);
        }
        System.out.println(sum);
    }
    public static int hansu(int n) {
        int count = 0;

        if (n < 100) count++;
        if (n >= 100 && n < 1000) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                int r = n % 10;
                n = n / 10;
                arr[i] = r;
            }
            if (arr[0] > arr[1]) {
                if (arr[0] - arr[1] == arr[1] - arr[2]) count++;
            } else if(arr[0] < arr[1]) {
                if(arr[1] - arr[0] == arr[2] - arr[1]) count++;
            } else if
                (arr[1] == arr[2]) { count++;}
        }
        return count;
        }
    }

