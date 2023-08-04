package Backjoon;

import java.util.Scanner;

public class B_4948 {

//    public static boolean primenumber(int n) {
//        boolean check = false;
//        int cnt = 0;
//
//        if(n<2) check = false;
//        else if(n==2) check = true;
//        else {
//            for(int i=2; i<n; i++) {
//                if(n % i == 0) cnt++;
//                if(cnt >= 1) break;
//            }
//            if(cnt == 0) check = true;
//        }
//
//        return check;
//    }
// 시간 초과 방법 3중첩 반복문

    public static int primenumber(int n) {

        int cnt = 0;
        int[] array = new int[2 * n + 1]; //배열 크기에 맞게 조절함

        for(int i=0; i<array.length; i++) {
            array[i] = i;
        }
        array[1] = 0;

        for(int i=2; i<array.length; i++) {
            if(array[i]==0) continue;
            for(int j=2*i; j<=2*n; j+=i) {
                array[j] = 0;
            }
        }
        for(int i=n+1; i< array.length; i++) {
            if(array[i]!=0) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int cnt = 0;
//
//        while(true) {
//            int n = in.nextInt();
//            cnt = 0;
//            for(int i=n; i<=2*n; i++) {
//                if(primenumber(i)) cnt++;
//            }
//            if(n==0) break;
//            System.out.println(cnt);
//        }
        while (true) {
            int n = in.nextInt();
            if(n==0) break;
            else{
                System.out.println(primenumber(n));
            }
        }
    }
}
