package Backjoon;
import java.util.Scanner;
public class B_1367 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = n;
		int count = 0;
		
		while(true) {
			int nums = num;
			int f = nums / 10;
			int s = nums % 10;
			
			int result_s = 0;
			
			int result = f + s;
			
			if(result >= 10) {
				result_s = result % 10;
			}else if(result < 10) {
				result_s = result;
			}
			
			num = (s * 10) + result_s;
			count++;
			if(num == n) {
				break;
			}
		}
		System.out.print(count);
	}

}
