package Backjoon;

import java.util.Scanner;

public class B_15649 {
	
	public static int[] arr;
	public static boolean[] check;
	
    public static void main(String[] args) {
    	System.out.println('a');
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int deapth = 0;
        
        arr = new int[M];
        check = new boolean[N];
        
        dfs(N, M, deapth);
    }
    //±íÀÌ ¿ì¼±Å½»ö
    public static void dfs(int N, int M, int deapth) {
    	if(deapth==M) {
    		for(int i=0; i<arr.length; i++) {
    			System.out.print(arr[i] + " ");
    		}
    		System.out.println("");
    		return;
    	}
    	
    	for(int i=0; i<N; i++) {
    		if(check[i]==false) {
    			check[i] = true;
        		arr[deapth] = i+1;
        		dfs(N, M, deapth+1);
        		check[i] = false;
    		}
    	}
    	return;
    }
}
