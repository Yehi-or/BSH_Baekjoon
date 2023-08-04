package Backjoon;

import java.io.*;
import java.util.HashMap;

//포켓몬 마스터 이다솜
public class B_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        String[] arr = new String[N];
        HashMap<String, Integer> hashMap = new HashMap<>(N);

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            hashMap.put(str, i + 1);
            arr[i] = str;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++) {
            String str = br.readLine();
            try {
                int a = Integer.parseInt(str);
                sb.append(arr[a - 1]).append("\n");
            }catch (Exception e) {
                sb.append(hashMap.get(str)).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}