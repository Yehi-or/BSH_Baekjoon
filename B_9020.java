package Backjoon;

import java.util.Scanner;

public class B_9020 {
    public static boolean primenumber(int n) {

        int[] array = new int[n + 1]; //배열 크기에 맞게 조절함
        boolean b = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        array[1] = 0;

        for (int i = 2; i < array.length; i++) {
            if (array[i] == 0) continue;
            for (int j = 2 * i; j <= n; j += i) {
                array[j] = 0;
            }
        }

        if (array[n] != 0) b = true;
        else b = false;

        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        int i = 0;
        int a;
        int b;

        while (i < test) {
            int n = in.nextInt();
            a = n / 2;
            b = n / 2;

            while(true) {
              if(primenumber(a) && primenumber(b)) {
                  System.out.println(a + " " + b);
                  break;
              }
              a--;
              b++;
            }
            i++;
        }
    }
}
