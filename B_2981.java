package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_2981 {
	public static void main(String[] args) {
		/**�⺻���� Ǯ�� ��� �Է� ���ڰ� A�� A = a * m + r
		 * B�� B = b * m + r
		 * �̶� r�� �����Ƿ� r�� ���ּ� m�� ���Ϸ��� A - B �� �ϸ� �ȴ�.
		 * A - B = a*m - b*m -> (a-b)m -> A - B = (a - b)m
		 * m�� �Ѱ� �̻��� ��츸 ��� �� m�� A - B �� ���
		 * ���� 2�� index 0, 1 �� index 1, 2�� ������ ���� ����� m�� �Ǵ°� �߰���
		 * ó������ �������ε������� A(arr[1]), B(arr[0]) �� ���̸� ���ϸ�
		 * �������� ���� -> �� ���� �ִ������� ���ؼ� �ִ������� ����� ����Ʈ��.
		 * ������ ������ �ȵǱ� ������ �迭�� sort ����. 
		 * **/
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		
		int minGcd;
		if(n>2) {
			minGcd = gcd(arr[1] - arr[0], arr[2] - arr[1]);
			for(int i=0; i<n-2; i++) {
				if(gcd(arr[i+1] - arr[i], arr[i+2] - arr[i+1]) < minGcd) {
					minGcd = gcd(arr[i+1] - arr[i], arr[i+2] - arr[i+1]);
				}
			}
		}else {
			minGcd = arr[1]-arr[0];
		}
//		if(n > 2) {
//			result = gcd(arr[1] - arr[0], arr[2] - arr[1]);
//		}else {
//			result = gcd(arr[1], arr[0]);
//		}
		
		for(int i=2; i<=minGcd; i++) {
			if(minGcd % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	//�ִ� ����� ���ϴ� �Լ�(��Ŭ���� ȣ����)
	public static int gcd(int a, int b) {
		int temp;
		while(b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}
