package Backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B_2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        double sum = 0;

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int max_cnt = -1;
        int cnt = 0;
        int max_val = arr[0];
        boolean check = false;

        for(int i=0; i<n-1; i++) {
            if(arr[i]==arr[i+1]) {
                cnt++;
            }else cnt = 0;
            if(max_cnt < cnt) {
                max_cnt = cnt;
                max_val = arr[i];
                check = true;
            }else if(max_cnt == cnt && check == true) {
                max_val = arr[i];
                check = false;
            }
        }
        System.out.println(((int)Math.round(sum / n) + "\n"));
        System.out.println(arr[arr.length / 2] + "\n");
        System.out.println(max_val + "\n");
        System.out.println(arr[arr.length - 1] - arr[0] + "\n");

    }
}
