package Backjoon.Test;

import java.io.*;
import java.util.StringTokenizer;

public class BufferdReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int i = Integer.parseInt(s);

        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s2 = "ABCDEFG";
        bw.write(a);
        bw.flush();
        bw.close();
    }
}
