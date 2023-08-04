package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BSH_Q10815 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++) array[i] = in.nextInt();
        Arrays.sort(array);

        int m = in.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<m; i++){
            int key = in.nextInt();
            if(binarySerch(array, key)>=0) sb.append(1).append(" ");
            else sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
    public static int binarySerch(int arr[], int key) {
        int io = 0;
        int hi = arr.length - 1;
        while(hi>=io) {
            int mid = io + (hi - io) / 2;
            if (key < arr[mid]) hi = mid - 1;
            else if (key > arr[mid]) io = mid + 1;
            else return mid;
        }
        return -1;
    }
}
