package Backjoon;

import java.util.Scanner;

public class B_2231 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int min = minValue(N);

        for(int i=min; i<N; i++) {
            if(sumVal(i)==N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    static int minValue(int a) {
        String str = String.valueOf(a);
        int length = str.length();
        if(length > 1) {
            for(int i=1; i<length; i++) {
                a -= 9;
            }
        }
        a -= Integer.parseInt(String.valueOf(str.charAt(0)));
        return a;
    }

    static int sumVal(int a) {
        String str = String.valueOf(a);
        int i = 0;
        int tmp = a;
        while(i < str.length()) {
//            a += Integer.parseInt(String.valueOf(str.charAt(i)));
            //���� ���ڿ� �ڸ��⸦ �����ʰ� ���ڷ� ����ϴ°� �� ���� a / 10 �Ȱ�����??
            tmp += a % 10;
            a = a / 10;
            i++;
        }
        return tmp;
    }
}
