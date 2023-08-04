package Backjoon;

import java.util.Scanner;

public class B_14889_a {

    static int N;
    static int[][] map;
    static boolean[] visit;
    static int cnt;

    static int Min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();

        map = new int[N][N];
        visit = new boolean[N];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = in.nextInt();
            }
        }

        combi(0, 0);
        System.out.println(Min);
        System.out.println(cnt);
    }

    // idx�� �ε���, count�� ���� ����(=��� ����)
    static void combi(int idx, int count) {
        // �� ������ �ϼ��� ���
        if(count == N / 2) {
            cnt++;
			/*
			 �湮�� ���� �湮���� ���� ���� ���� ������
			 �� ���� ������ ���� �� �ּڰ��� ã�´�.
			*/
            diff();
            return;
        }

        for(int i = idx; i < N; i++) {
            // �湮���� �ʾҴٸ�?
            if(!visit[i]) {
                visit[i] = true;	// �湮���� ����
                combi(i + 1, count + 1);	// ��� ȣ��
                visit[i] = false;	// ��Ͱ� ������ ��湮���� ����
            }
        }
    }

    // �� ���� �ɷ�ġ ���̸� ����ϴ� �Լ�
    static void diff() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                // i ��° ����� j ��° ����� true��� ��ŸƮ������ ���� �÷���
                if (visit[i] == true && visit[j] == true) {
                    team_start += map[i][j];
                    team_start += map[j][i];
                }
                // i ��° ����� j ��° ����� false��� ��ũ������ ���� �÷���
                else if (visit[i] == false && visit[j] == false) {
                    team_link += map[i][j];
                    team_link += map[j][i];
                }
            }
        }
        // �� ���� ���� ���� (����)
        int val = Math.abs(team_start - team_link);

        /*
         * �� ���� �������� 0�̶�� ���� ���� �ּڰ��̱� ������
         * ���̻��� Ž�� �ʿ���� 0�� ����ϰ� �����ϸ� �ȴ�.
         */
        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }

        Min = Math.min(val, Min);

    }

}
