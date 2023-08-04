package Backjoon;
import java.util.Scanner;
public class BSH_Q2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int max = 0;
		
		if(n1==n2 && n2==n3) {
			System.out.println(10000 + (n1 * 1000));
		}else if(n1==n2) {
			System.out.println(1000 + (n1 * 100));
		}else if(n2==n3) {
			System.out.println(1000 + (n2 * 100));
		}else if(n1==n3) {
			System.out.println(1000 + (n1 * 100));
		}else {
			if(n1>n2 && n1>n3) { max = n1;
			}else if(n2>n1 && n2>n3) {max = n2;
			}else if(n3>n1 && n3>n2) {max = n3;
			}System.out.println(max * 100);
		}
	}

}
/*
20220514
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 15분
*/