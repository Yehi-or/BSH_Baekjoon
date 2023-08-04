package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BSH_Q1920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        Arrays.sort(array);

        int m = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            if (binarySearch(array, in.nextInt()) >= 0) {
                sb.append(1).append("\n");
            }else
                sb.append(0).append("\n");
        }
        System.out.println(sb);
    }
        public static int binarySearch(int arr[], int key) {
            int lo = 0;
            int hi = arr.length - 1;
            while(lo<=hi) {
                int mid = (lo + hi) / 2;
                if(key > arr[mid]) lo = mid + 1;
                else if(key < arr[mid]) hi = mid - 1;
                else return mid;
            }
            return -1;
        }
}
