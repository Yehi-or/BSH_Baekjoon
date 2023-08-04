package Backjoon;

import java.util.Scanner;

class merge {

    int[] arr;
    int[] tmp;
    private int k;
    private int cnt;

    public void merge_sort(int p, int r) {
        if(p < r) {
            int q = (p + r) / 2;
            merge_sort(p, q);
            merge_sort(q + 1, r);
            merge(p, q, r);
        }
    }

    public void merge(int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while(i <= q && j <= r) {
            if(arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            }else {
                tmp[t++] = arr[j++];
            }
        }
        while(i <= q) {
            tmp[t++] = arr[i++];
        }
        while(j <= r) {
            tmp[t++] = arr[j++];
        }
        i = p;
        t = 0;
        while(i <= r) {
            arr[i++] = tmp[t++];
            cnt++;
            if(cnt == k) {
                System.out.println(arr[i - 1]);
                System.exit(0);
            }
        }
    }

    public merge(int n, int k) {
        arr = new int[n];
        tmp = new int[n];
        cnt = 0;
        this.k = k;
    }

}
public class B_24060 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        merge m = new merge(n, k);

        for(int i=0; i<n; i++) {
            m.arr[i] = in.nextInt();
        }

        m.merge_sort(0, n-1);
        System.out.println(-1);
    }
}
