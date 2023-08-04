package Backjoon;

import java.util.Scanner;

public class B_2775 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for(int i=0; i<t; i++) {

            int k = in.nextInt();
            int n = in.nextInt();

            int[][] arr = new int[k+1][n];
            for(int j=0; j<k+1; j++) {
                int sum = 0;
                for(int a=0; a<n; a++) {
                    if(j==0) {
                        arr[j][a] = a+1;
                    }
                    else {
                        sum += arr[j-1][a];
                        arr[j][a] = sum;
                    }
                }
            }
            System.out.println(arr[k][n-1]);
        }
    }
}
