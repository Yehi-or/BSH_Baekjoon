package Backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B_1181 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String[] sarr = new String[n];

		for(int i=0; i<n; i++) {
			sarr[i] = in.next();
		}

		Arrays.sort(sarr, new Comparator<String>() {
			@Override
			public int compare(String arr1, String arr2) {
				if(arr1.length()==arr2.length()) {
					return arr1.compareTo(arr2);
				}else {
					return arr1.length() - arr2.length();
				}
			}
		});

		for(int i=0; i<n; i++) {
			if(i!=n-1) {
				if(sarr[i].equals(sarr[i+1])) {
				}else {
					System.out.println(sarr[i]);
				}
			}else {
				System.out.println(sarr[n-1]);
			}

		}


	}

}
