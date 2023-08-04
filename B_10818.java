package Backjoon;
import java.util.Scanner;
public class B_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]s = new int[n];
		
		int max = -10000000;
		int min = 10000000;
		
		for(int i=0; i<n; i++) {
			s[i] = sc.nextInt();
			if(s[i] > max) max = s[i];
			if(s[i] < min) min = s[i];
		}
		System.out.print(min + " " + max);
		

	}

}
