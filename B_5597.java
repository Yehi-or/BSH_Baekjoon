package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_5597 {

	public static void main(String[] args) {
		System.out.println('a');
		int[] arr = new int[30];
		Scanner in = new Scanner(System.in);
		for(int i=0; i<30; i++) {
			arr[i] = i+1;
		}
		
		Arrays.sort(arr);

		for(int i=0; i<28; i++) {
			int n = in.nextInt();
			arr[n-1] = 0;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
