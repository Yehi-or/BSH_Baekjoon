package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BSH_Q10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int key = sc.nextInt();
            sb.append(high(array, key) - low(array, key)).append(" ");
        }
        System.out.println(sb);
    }
    public static int high(int arr[], int key) {
        int iow = 0;
        int high = arr.length;
        while(iow < high) {
            int mid = iow + (high - iow) / 2;
            if(key >= arr[mid]) iow = mid + 1;
            else if(key < arr[mid]) high = mid;
        }
        return high;
    }
    public static int low(int arr[], int key) {
        int iow = 0;
        int high = arr.length;
        while(iow<high) {
            int mid = iow + (high - iow) / 2;
            if(key <= arr[mid]) high = mid;
            else if(key > arr[mid]) iow = mid + 1;
        }
        return iow;
    }
}
