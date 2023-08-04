package Backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_1003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        int[] fibo = new int[41]; // 피보나치 수열 값을 저장할 배열

        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= 40; i++) { // 40까지 계산
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for (int j = 0; j < n; j++) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                bw.write("1 0\n");
            } else if (N == 1) {
                bw.write("0 1\n");
            } else {
                bw.write(fibo[N-1] + " " + fibo[N] + "\n");
            }
        }

        br.close();
        bw.close();
    }
}