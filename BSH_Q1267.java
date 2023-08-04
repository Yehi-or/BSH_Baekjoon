package Backjoon;

import java.util.Scanner;

public class BSH_Q1267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] s = new int[n];
		int y = 0;
		int m = 0;

		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt();
		}

		int y_price = 0;
		int y_total = 0;
		int m_price = 0;
		int m_total = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i] % 30 >= 0)
				y = 10;
			if (s[i] % 60 >= 0)
				m = 15;

			y_price = ((s[i] / 30) * 10) + y;
			y_total = y_total + y_price;
			m_price = ((s[i] / 60) * 15) + m;
			m_total = m_total + m_price;
		}

		if (y_total > m_total)
			System.out.println("M" + " " + m_total);
		else if (m_total > y_total)
			System.out.println("Y" + " " + y_total);
		else if (m_total == y_total)
			System.out.println("Y" + " " + "M" + " " + y_total);
	}
}
/*
 * 20220514 문제이해도:4(1~5사이 숫자) 문제 해결 : o 코딩 시간 : 30분
 */