package Backjoon;

import java.util.Scanner;

public class B_2581 {
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
		
			int m = in.nextInt();
			int n = in.nextInt();
			
			int sum = 0;
			int cnt = 0;
			int mini = 10000;
			boolean b = false;
			
			boolean[] bo = new boolean[n-m+1];
			
			for(int i=m; i<=n; i++) {
			    bo[cnt]  = primenumber(i);
			    if(primenumber(i)) {
			    	sum += i;
			    	if(i < mini) mini = i;
			    }
			    cnt++;
			}
			for(int j=0; j<bo.length; j++) {
				if(bo[j]==true) {
					b = true;
					break;
				}
			}
			
			if(b==false) {
				System.out.println(-1);
			}
			else {
				System.out.println(sum);
				System.out.println(mini);
			}
	}
}
