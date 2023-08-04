package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_14889 {
    public static int[][] arr;
    public static boolean[] b_arr;
    public static int N;
    public static int sum_true = 0;
    public static int sum_false = 0;
    public static int MIN;
    public static int differ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        b_arr = new boolean[N];
        arr = new int[N][N];

        for(int i=0; i<N; i++) {
            //스트링토크나이저를 이용해서 라인의 숫자를 배열에 집어 넣는다.
            //Scanner 도 가능 하나 한번 해봄.
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //배열의 숫자의 최대는 100이므로 최댓값은 100 * (N / 2) 스타트 링크 팀은 반반 나뉘어지기 때문
        MIN = 100 * (N / 2);
        dfs(0, 0);
        System.out.println(MIN);
    }
    //깊이 우선 탐색 시작
    public static void dfs(int index, int deapth) {
        //깊이가 N / 2 -> 스타트와 링크가 팀이 나뉘어 지면(boolean 배열의 true, false 로 구분)
        if(deapth== N / 2) {
            //스타트, 링크 팀 합을 계산
            for(int i=0; i<N-1; i++) {
                for(int j=i+1; j<N; j++) {
                    if(b_arr[i] && b_arr[j]) {
                        sum_true += arr[i][j];
                        sum_true += arr[j][i];
                    }else if(!b_arr[i] && !b_arr[j]){
                        sum_false += arr[i][j];
                        sum_false += arr[j][i];
                    }
                }
            }

            if(sum_true >= sum_false) {
                differ = sum_true - sum_false;
            }else {
                differ = sum_false - sum_true;
            }
            /**만약 두 수의 차가 MIN보다 작다면 MIN에 넣어쥼
             * 그리고 두수의 차의 최솟값은 0이므로 만약에 0이 나오면 0을 출력하고 프로그램 종료(불 필요한 반복을 줄임)
             * **/
            if(differ < MIN) {
                MIN = differ;
                if(differ==0) {
                    System.out.println(0);
                    System.exit(0);
                }
            }
            //반복 한번이 끝나면 반복 종료
            sum_false = 0;
            sum_true = 0;
            return;
        }
        //불린 배열을 나눠줌 해당 인덱스의 배열이 false 라면 true로 만들어주고 재귀 시작 -> 해당 재귀가 끝나면 다시 false로 만들어줘서
        //다음 재귀를 시작 할 수있게 함.
        //처음에는 dfs(i + 1, deapth + 1) 자리에 index + 1을 대입함 -> i 가 커져도 계속 index + 1로 재귀를 시작해서 불필요한 재귀가
        //많았음 때문에 시간초과 요류가 뜸 -> i + 1로 변경해서 해결
        for(int i=index; i<N; i++) {
            if(!b_arr[i]) {
                b_arr[i] = true;
                dfs(i + 1, deapth + 1);
                b_arr[i] = false;
            }
        }
    }
}
//2023-02-06 14:45
