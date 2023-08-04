package Backjoon;

import java.util.Scanner;

public class B_1193 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;
        int sum = 0;

        if(n==1) {
            System.out.println(1 + "/" + 1);
        }else {
            while(sum<n) {
              cnt++;
              sum += cnt;
            }
            int q = cnt;
            int p = 1;
            int num = n - (sum - cnt);
            for(int i=1; i<num; i++) {
                q--;
                p++;
            }
            if(cnt % 2 ==0) System.out.println(p + "/" + q);
            else System.out.println(q + "/" + p);
        }
    }
}
