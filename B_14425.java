package Backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class B_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int cnt = 0;

        HashSet<String> set = new HashSet<>();

                String[] check_set = new String[M];

        for(int i=0; i<N; i++) {
            set.add(br.readLine());
        }

        for(int i=0; i<M; i++) {
            check_set[i] = br.readLine();
        }

        for (String value : check_set) {
            if (set.contains(value)) {
                cnt++;
            }
        }
        //bw.write 는 문자열 형태로 출력해야한다..
        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
//2023 03-16
//Hash-set