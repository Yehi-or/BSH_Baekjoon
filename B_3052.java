package Backjoon;
import java.util.Scanner;
public class B_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] s = new int[10]; //숫자 10개를 대입할 배열 선언
		int count = 0;
		
		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextInt(); //인덱스에 정수를 대입
			s[i] = s[i] % 42; //42로 나눈 나머지 값이 필요하니 나머지를 배열에 대입한다.
		}
		for(int i=0; i<s.length; i++) {
			boolean b = false; //불린 b의 기본값은 false로 한다
			for(int j=i+1; j<s.length; j++) {
				if(s[i]==s[j]) {
					b = true; //값이 같다면 b는 true로 바꾼다
					break;
				}
			}
			if(b==false) //false가 나왔다면 서로 다른 수라는것을 알 수 있다.
				count++; 
		}
		System.out.println(count);
		
	}
}
