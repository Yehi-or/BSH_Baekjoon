package Backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		String[] arr = new String[T];
		
		for(int i=0; i<T; i++) {
			String vps = br.readLine();
			int leftCnt = 0;
			int rightCnt = 0;
			for(int j=0; j<vps.length(); j++) {
				if(vps.charAt(j)=='(') leftCnt++;
				if(vps.charAt(j)==')') rightCnt++;
				if(rightCnt > leftCnt) {
					break;
				}
			}
			if((leftCnt+rightCnt) % 2 == 0 && leftCnt==rightCnt) {
				arr[i] = "YES";
			}else {
				arr[i] = "NO";
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();
	}
}
