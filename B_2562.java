package Backjoon;
import java.util.Scanner;
public class B_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]s = new int[9];
		int max = 0;
		int n = 0;
		
		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextInt();
			if(s[i] > max) {
				max = s[i];
				n = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(n);
	}

}
