package Backjoon;
import java.util.Scanner;

public class B_9663 {

    public static int N;
    public static int[] arr;
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        arr = new int[N];
        dfs(0);
        System.out.println(cnt);
    }

    public static void dfs(int deapth) {
        if(deapth==N) {
            cnt++;
            return;
        }
        for(int i=0; i<N; i++) {
            arr[deapth] = i + 1;
            if(check(deapth)) {
                dfs(deapth+1);
            }
        }
    }

    public static boolean check(int ch) {
        for(int i=0; i<ch; i++) {
            if(arr[i] == arr[ch]) {
                return false;
            }
//          arr[i]의 대각선에 있는 수라면 return false
            //대각선을 잘 풀지 못해서 한번더 봐야할듯
            //열의 수 차이의 절댓값 == 행의 수 차이의 절댓값
            if(Math.abs(ch - i) == Math.abs(arr[ch]-arr[i])) {
                return false;
            }
        }
        return true;
    }
}
