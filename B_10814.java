package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_10814 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String[][] sarr = new String[n][2];

        for(int i=0; i<n; i++) {
            sarr[i][0] = in.next();
            sarr[i][1] = in.next();
        }

        Arrays.sort(sarr, (arr1, arr2) -> {
            if(Integer.parseInt(arr1[0])==Integer.parseInt(arr2[0])) {
                return 0;
            }else {
                return Integer.parseInt(arr1[0]) - Integer.parseInt(arr2[0]);
            }
        });

        for(int i=0; i<n; i++) {
            System.out.print(sarr[i][0] + " ");
            System.out.print(sarr[i][1] + "\n");
        }


    }
}
