package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2869 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	
//        스캐너 시간초과 버퍼리더로 변경.
//        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
//        
// -시간초과 방법-
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
        //생각해낸 방법 1일당 움직이는 길이는 a - b 이지만 마지막날(도착하는 시점)에는 a만 증가한다 이러면 전체 막대 길이에서 b 만큼빼고 마지막 날에도 a - b 만큼 가면 동일하다고 결론은 내렸다.
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
