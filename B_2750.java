package Backjoon;

import java.util.Scanner;

public class B_2750 {

    public static void partition(int []arr, int start, int end) {
        int partition = quickSort(arr, start, end);

        if(end > partition) partition(arr, partition, end);
        if(start < partition - 1) partition(arr, start, partition - 1);
    }

    public static int quickSort(int []arr, int start, int end) {
        int pivot = arr[(start + end) / 2 + 1];

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
        int []arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        
        partition(arr, 0, arr.length-1);

        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
