package Backjoon;
import java.util.Scanner;
public class B_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] s = new int[10]; //���� 10���� ������ �迭 ����
		int count = 0;
		
		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextInt(); //�ε����� ������ ����
			s[i] = s[i] % 42; //42�� ���� ������ ���� �ʿ��ϴ� �������� �迭�� �����Ѵ�.
		}
		for(int i=0; i<s.length; i++) {
			boolean b = false; //�Ҹ� b�� �⺻���� false�� �Ѵ�
			for(int j=i+1; j<s.length; j++) {
				if(s[i]==s[j]) {
					b = true; //���� ���ٸ� b�� true�� �ٲ۴�
					break;
				}
			}
			if(b==false) //false�� ���Դٸ� ���� �ٸ� ����°��� �� �� �ִ�.
				count++; 
		}
		System.out.println(count);
		
	}
}
