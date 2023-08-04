package Backjoon;
import java.util.Scanner;
public class BSH_Q2476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] s = new int[n];
		int max_reward = 0;
		
		for(int i=0; i<n; i++) {
			int reward = 0;
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			int max = 0;
			
			if(n1==n2 && n2==n3) {
				reward = (10000 + (n1 * 1000));
			}else if(n1==n2) {
				reward = (1000 + (n1 * 100));
			}else if(n2==n3) {
				reward = (1000 + (n2 * 100));
			}else if(n1==n3) {
				reward = (1000 + (n1 * 100));
			}else {
				if(n1>n2 && n1>n3) { max = n1;
				}else if(n2>n1 && n2>n3) {max = n2;
				}else if(n3>n1 && n3>n2) {max = n3;
				}reward = (max * 100);
			}
			s[i] = reward;
		}
		
		for(int i=0; i<s.length; i++) {
			if(s[i] > max_reward) max_reward = s[i];
		}
		System.out.println(max_reward);
	}
}
/*
20220514
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 15분
*/


