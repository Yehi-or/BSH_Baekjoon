package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_2981 {
	public static void main(String[] args) {
		/**기본적인 풀이 방법 입력 숫자가 A면 A = a * m + r
		 * B면 B = b * m + r
		 * 이때 r은 같으므로 r을 없애서 m을 구하려면 A - B 를 하면 된다.
		 * A - B = a*m - b*m -> (a-b)m -> A - B = (a - b)m
		 * m은 한개 이상인 경우만 취급 즉 m은 A - B 의 약수
		 * 앞의 2개 index 0, 1 과 index 1, 2의 차이의 공통 약수가 m이 되는걸 발견함
		 * 처음부터 마지막인덱스까지 A(arr[1]), B(arr[0]) 의 차이를 비교하며
		 * 공통약수를 구함 -> 그 값의 최대공약수를 구해서 최대공약수의 약수를 프린트함.
		 * 음수가 나오면 안되기 때문에 배열을 sort 해줌. 
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
	//최대 공약수 구하는 함수(유클리드 호제법)
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
