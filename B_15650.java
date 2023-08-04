package Backjoon;

import java.util.Scanner;

public class B_15650 {
	//자기보다 큰 수만 출력하면 된다. 자기보다 작은수 x
	public static int[] arr;
	public static boolean[] check;
	public static boolean[] check2;
	
    public static void main(String[] args) {
    	System.out.println('a');
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int deapth = 0;
        
        arr = new int[M];
        check = new boolean[N];
        check2 = new boolean[N];
        
        dfs(N, M, deapth);
    }
    //깊이 우선탐색
    public static void dfs(int N, int M, int deapth) {
    	int i=0;
    	int cnt = 0;
    	if(deapth==M) {
    		for(int j=0; j<arr.length; j++) {
    			System.out.print(arr[j] + " ");
    		}
    		System.out.println("");
    		return;
    	}
    	
    	for(i=0; i<N; i++) {
    		if(i<N && cnt>=1) {
        		check[cnt-1] = true;
        	}
    		if(check[i]==false) {
    			check[i] = true;
        		arr[deapth] = i+1;
        		dfs(N, M, deapth+1);
        		check[i] = false;
    		}
    		cnt++;
    	}
    	return;
    }
}
