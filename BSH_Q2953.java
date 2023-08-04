package Backjoon;
import java.util.Scanner;
public class BSH_Q2953 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] s = new int[5][4];
		int max_line = 0;
		int max_line_sum = 0;
		
		for(int i=0; i<s.length; i++) {
			int line_sum = 0;
			for(int j=0; j<s[i].length; j++) {
				s[i][j] = sc.nextInt();
				line_sum += s[i][j];
				if(line_sum > max_line_sum) {
					max_line = i;
					max_line_sum = line_sum;
				}
			}
		}
		System.out.println((max_line + 1) + " " + max_line_sum);
	}
}
/*
20220514
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 20분
*/