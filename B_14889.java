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
            //��Ʈ����ũ�������� �̿��ؼ� ������ ���ڸ� �迭�� ���� �ִ´�.
            //Scanner �� ���� �ϳ� �ѹ� �غ�.
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //�迭�� ������ �ִ�� 100�̹Ƿ� �ִ��� 100 * (N / 2) ��ŸƮ ��ũ ���� �ݹ� ���������� ����
        MIN = 100 * (N / 2);
        dfs(0, 0);
        System.out.println(MIN);
    }
    //���� �켱 Ž�� ����
    public static void dfs(int index, int deapth) {
        //���̰� N / 2 -> ��ŸƮ�� ��ũ�� ���� ������ ����(boolean �迭�� true, false �� ����)
        if(deapth== N / 2) {
            //��ŸƮ, ��ũ �� ���� ���
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
            /**���� �� ���� ���� MIN���� �۴ٸ� MIN�� �־���
             * �׸��� �μ��� ���� �ּڰ��� 0�̹Ƿ� ���࿡ 0�� ������ 0�� ����ϰ� ���α׷� ����(�� �ʿ��� �ݺ��� ����)
             * **/
            if(differ < MIN) {
                MIN = differ;
                if(differ==0) {
                    System.out.println(0);
                    System.exit(0);
                }
            }
            //�ݺ� �ѹ��� ������ �ݺ� ����
            sum_false = 0;
            sum_true = 0;
            return;
        }
        //�Ҹ� �迭�� ������ �ش� �ε����� �迭�� false ��� true�� ������ְ� ��� ���� -> �ش� ��Ͱ� ������ �ٽ� false�� ������༭
        //���� ��͸� ���� �� ���ְ� ��.
        //ó������ dfs(i + 1, deapth + 1) �ڸ��� index + 1�� ������ -> i �� Ŀ���� ��� index + 1�� ��͸� �����ؼ� ���ʿ��� ��Ͱ�
        //������ ������ �ð��ʰ� ����� �� -> i + 1�� �����ؼ� �ذ�
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
