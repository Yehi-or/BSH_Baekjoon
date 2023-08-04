package Backjoon;
import java.util.Scanner;
public class B_1546 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //배열의 크기 선언
		double[] s = new double[n];
		double max = 0; //max값을 나눠줘야 하니 초기값 0으로 선언
		double total = 0;
		
		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextDouble();
			if(s[i]>max) max = s[i];
		}
		
		for(int i=0; i<s.length; i++) {
			s[i] = (s[i] / max) * 100;
			total += s[i];
		}
		
		double avg = total / s.length;
		System.out.println(avg);

	}

}
