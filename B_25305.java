package Backjoon;

import java.util.Scanner;

public class B_25305 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();
		int cnt = 0;
		int check;

		int[] arr = new int[10001];

		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			arr[x]++;
		}

		for (int i = 0; i < 10001; i++) {
			if (arr[10000 - i] >= 1) {
				cnt = arr[10000 - i];
				for (int j = 0; j < cnt; j++) {
					k -= 1;
					if (k == 0) {
						System.out.println(10000 - i);
						break;
					}
					;
				}
			}
			if (k == 0)
				break;
		}

	}

}
