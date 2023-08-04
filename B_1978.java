package Backjoon;

import java.util.Scanner;

public class B_1978 {
	public static boolean primenumber(int n) {
		boolean check = false;
		int cnt = 0;
		
		if(n<2) check = false;
		else if(n==2) check = true;
		else {
			for(int i=2; i<n; i++) {
				if(n % i == 0) cnt++;
				if(cnt >= 1) break;
			}
			if(cnt == 0) check = true;
		}
		return check;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			int pnum = in.nextInt();
			if(primenumber(pnum)) cnt++;
		}
		System.out.println(cnt);
	}

}
