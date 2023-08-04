package Backjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B_15651 {
	
	public static int[] arr;
	public static int N;
	public static StringBuilder sb = new StringBuilder();
	
	//system.out 시간초과 -> StringBuilder로 변경
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		int M = in.nextInt();
		
		arr = new int[M];
		
		dfs(M, 0);
		String s = sb.toString();
		bw.write(s);
		bw.flush();
	}
	
	public static void dfs(int M, int deapth) {
		if(deapth==M) {
			for(int i=0; i<arr.length; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<N; i++) {
			arr[deapth] = i + 1;
			dfs(M, deapth+1);
		}
		return;
	}
}
