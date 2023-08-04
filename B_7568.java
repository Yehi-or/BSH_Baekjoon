package Backjoon;

//import java.util.Scanner;
//
//public class B_7568 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int cnt = 1;
//
//        int[][] size_arr = new int[N][2];
//        int[] rank = new int[N];
//        //2���� �迭 ���� ������, Ű�� ��� ����.
//
//        for(int i=0; i<N; i++) {
//            int x = in.nextInt();
//            int y = in.nextInt();
//            size_arr[i][0] = x;
//            size_arr[i][1] = y;
//        }
//
//        for(int i=0; i<N; i++) {
//            cnt = 1;
//            for(int j=0; j<N; j++) {
//                if(size_arr[i][0] < size_arr[j][0] && size_arr[i][1] < size_arr[j][1]) {
//                    cnt++;
//                }
//            }
//            rank[i] = cnt;
//        }
//
//        for(int i=0; i<N; i++) {
//            System.out.print(rank[i] + " ");
//        }
//    }
//}
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class B_7568 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int cnt = 1;
//
//        int[][] size_arr = new int[N][2];
//        int[] rank = new int[N];
//        //2���� �迭 ���� ������, Ű�� ��� ����.
//
//        for(int i=0; i<N; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            int x = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());
//            size_arr[i][0] = x;
//            size_arr[i][1] = y;
//        }
//
//        for(int i=0; i<N; i++) {
//            cnt = 1;
//            for(int j=0; j<N; j++) {
//                if(size_arr[i][0] < size_arr[j][0] && size_arr[i][1] < size_arr[j][1]) {
//                    cnt++;
//                }
//            }
//            rank[i] = cnt;
//        }
//
//        for(int i=0; i<N; i++) {
//            System.out.print(rank[i] + " ");
//        }
//    }
//}
//���۸��� ���
//compare ������ ��� ó���� �����Ѱ� �� �ڵ� ���µ� ������ ���� gpt �� ���� (03-14 ���� sort ������ ���鼭 ���� �� ������.)
//compare �޼ҵ� ������ �׸��� �� �ӵ��� �� ������ �������� ??
        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;
        import java.util.StringTokenizer;

public class B_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Person[] people = new Person[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            people[i] = new Person(weight, height);
        }

        Arrays.sort(people); // Ű �������� �������� ����

        int[] dp = new int[N];
        Arrays.fill(dp, 1);

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (people[j].weight < people[i].weight && people[j].height < people[i].height) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(dp[i]).append(" ");
        }
        System.out.println(sb);
    }

    static class Person implements Comparable<Person> {
        int weight;
        int height;

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        @Override
        public int compareTo(Person o) {
            return this.height - o.height;
        }
    }
}

