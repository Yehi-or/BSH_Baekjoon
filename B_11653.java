package Backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class B_11653 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		int n = in.nextInt();
		int mini = 0;

		while(n > 1) {
			for(int i=2; i<=n; i++) {
				if(n % i == 0) {
					mini = i;
					break;
				}
			}
			n = n / mini;
			a.add(mini);
		}
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
	}


}
