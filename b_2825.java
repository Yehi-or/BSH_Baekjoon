package Backjoon;
import java.util.Scanner;
public class b_2825 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		int h;
		
		for(int i=0; i<n; i++) {
			int tree_h = sc.nextInt();
			sum = sum + tree_h;
		}
		h = (sum - m) / n;
		System.out.print(h);
		
		
		
		
		

	}

}
