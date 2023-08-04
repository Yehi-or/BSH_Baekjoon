package Backjoon;
import java.util.Scanner;

public class B_1929 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        int cnt = 0;

        int[] array = new int[10001];

        for(int i=0; i<=10000; i++) {
            array[i] = i;
        }

        array[1] = 0;

        for(int i=2; i<n; i++) {
            if(array[i]==0) continue;
            for(int j=2*i; j<=n; j+=i) {
                cnt++;
                array[j] = 0;
            }
        }
        System.out.println(cnt);
//        for(int i=m; i<=n; i++) {
//            if(array[i] != 0) System.out.println(array[i]);
//        }
    }
}
//�����佺�׳׽��� ü (2���� �ڱ� �ڽ��� ����� �迭���� ����.)
//�� 1�� �ڸ����ڿ� 2, 3, 5, 7 �� �Ҽ� �̹Ƿ� 2 * 2... , 3 * 2... ���� ���� �ȴ�.
