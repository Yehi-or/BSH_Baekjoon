package Backjoon;

import java.util.Scanner;

public class B_1427 {
    public static void quicksort(int[] arr,int start, int end) {
        int part = partition(arr, start, end);

        if(start < part - 1)  quicksort(arr, start, part - 1);
        if(end > part) quicksort(arr, part, end);

    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];

        while(start <= end) {
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String s = String.valueOf(n);
        int r, i = 0;

        int[] arr = new int[s.length()];

        while(n > 0) {
            r = n % 10;
            arr[i] = r;
            n = n / 10;
            i++;
        }

        quicksort(arr, 0, arr.length-1);

        for(int j=arr.length-1; j>=0; j--) {
            System.out.print(arr[j]);
        }
    }
}
