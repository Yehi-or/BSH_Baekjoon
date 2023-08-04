package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B_18870 {
    public static void main(String[] args) throws IOException {
        // 중복된 값을 구분 하기 힘듬 다른방법을 찾아야 할듯
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//
//        int[] iarr = new int[n];
//        int[] i2arr = new int[n];
//        int[] carr = new int[n];
//
//        for(int i=0; i<n; i++) {
//            iarr[i] = in.nextInt();
//            i2arr[i] = iarr[i];
//        }
//
//        Arrays.sort(iarr);
//
//        int cnt = 0;
//        carr[0] = 0;
//
//        for(int i=0; i<n; i++) {
//            if(i!=n-1) {
//                if(iarr[i+1] > iarr[i]) {
//                    cnt++;
//                    carr[i+1] = cnt;
//                }else {
//                    carr[i+1] = cnt;
//                }
//            }else {
//                if(iarr[n-1] > iarr[n-2]) {
//                    cnt++;
//                    carr[n-1] = cnt;
//                }else {
//                    carr[n-1] = cnt;
//                }
//            }
//        }
//
//        int[][] arr = new int[n][2];
//
//        for(int i=0; i<n; i++) {
//            arr[i][0] = i2arr[i];
//            arr[i][1] = carr[i];
//        }
//
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] arr1, int[] arr2) {
//                    if(arr1[0] == arr2[0]) {
//                        int temp = arr1[1];
//                        arr1[1] = arr2[1];
//                        arr2[1] = temp;
//                    }
//                    return arr1[0] - arr2[0];
//            }
//        });
//
//        for(int i=0; i<n; i++) {
//            System.out.print(arr[i][1] + " ");
//        }
        //두 번째 방법
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력할 값을 받음
        int N = Integer.parseInt(br.readLine());

        int[] narr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<N; i++) {
            narr[i] = Integer.parseInt(st.nextToken());
        }

        //narr을 복사해서 sarr에 넣어줌
        int[] sarr = narr.clone();

        Arrays.sort(narr);

        int index = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        //HashMap을 생성하고 정렬된 값들을 키로 지정하고 키값이 커질수록 1씩 증가함 -> 좌표압축
        for(int k : narr) {
            if(!map.containsKey(k)) {
                map.put(k, index);
                index++;
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int k : sarr) {
            sb.append(map.get(k)).append(" ");
        }

        System.out.println(sb);
    }
}
