package Backjoon;

import java.util.Scanner;

public class B_2798 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        int max = 0;

        int[] card = new int[n];

        for(int i=0; i<n; i++) {
            card[i] = in.nextInt();
        }

        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    sum += card[i] + card[j] + card[k];
                    if(sum < m && sum >= max) {
                        max = sum;
                    }
                    if(sum==m) {
                        System.out.println(sum);
                        System.exit(0);
                    }
                    sum = 0;
                }
            }
        }

        System.out.println(max);
    }
}
//2023-02-22