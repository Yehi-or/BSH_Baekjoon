package Backjoon;

import java.io.*;

public class B_11729 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        bw.write((int)Math.pow(2, N) - 1 + "\n");

        Hanoi(N, 1, 2, 3);

        bw.flush();
        bw.close();
    }

    public static void Hanoi(int N, int start, int move, int end) throws IOException {
        if(N==1) {
            bw.write(start + " " + end + "\n");
            return;
        }

        Hanoi(N - 1, start, end, move);

        bw.write(start + " " + end + "\n");

        Hanoi(N - 1, move, start, end);
    }
}
