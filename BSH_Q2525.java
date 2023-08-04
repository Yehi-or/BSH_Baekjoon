package Backjoon;
import java.util.Scanner;
public class BSH_Q2525 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int add = sc.nextInt();
		int totalmin = (h * 60) + m + add;
		
		if(h<24 && m<60) {
			h = totalmin / 60;
			m = totalmin % 60;
			if(h>=24)
				h = h - 24;
		}
		System.out.println(h + " " + m);
	}
}
/*
20220514
문제이해도:3(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 30분
*/