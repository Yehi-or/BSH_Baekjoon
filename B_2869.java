package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2869 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	
//        ��ĳ�� �ð��ʰ� ���۸����� ����.
//        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
//        
// -�ð��ʰ� ���-
//        int sum = 0;
//        int days = 1;
//
//        while(sum<v) {
//            sum += a;
//            if(sum>=v) {
//                break;
//            }else sum -= b;
//            days++;
//        }
//        System.out.println(days);
        //�����س� ��� 1�ϴ� �����̴� ���̴� a - b ������ ��������(�����ϴ� ����)���� a�� �����Ѵ� �̷��� ��ü ���� ���̿��� b ��ŭ���� ������ ������ a - b ��ŭ ���� �����ϴٰ� ����� ���ȴ�.
        double newA = v - b;
        double dayOne = a - b;
        
        double totalDay = newA / dayOne;
        int intTotalDay = (int)totalDay;
        if(totalDay / intTotalDay != 1) {
        	System.out.println(intTotalDay + 1);
        }else {
        	System.out.println(intTotalDay);
        }

    }
}
