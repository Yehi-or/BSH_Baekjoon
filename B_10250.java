package Backjoon;
import java.util.Scanner;
public class B_10250 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] s = new int[t];
		
		int y = 0;
		int x = 0;
		
		for(int i=0; i<t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
		
			if(n%h==0) {
				y = h * 100;
			}else {
				y = (n % h) * 100;
			}
		
		
			for(int j=1; j<=w; j++) {
				if(n>h * (j-1) && n<=h*j) {
					x = j;
				}
			}
			s[i] = x + y;
		}
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
	}
	
}
