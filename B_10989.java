package Backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		int num;
		int cnt;
		
		for(int i=0; i<n; i++) {
			num = Integer.parseInt(br.readLine());
			arr[num]++;
		}
		
		for(int i=0; i<10001; i++) {
			if(arr[i] < 1) continue;
			else {
				cnt = arr[i];
				for(int j=0; j<cnt; j++) {
					bw.write(i + "\n");
				}
			}
		}
		bw.close();
	}
}
