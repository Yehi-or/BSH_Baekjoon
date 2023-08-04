package Backjoon;

public class B_4673 {
	public static void main(String[] args) {
		boolean[] b = new boolean[10001];

		for(int i=1; i<10001; i++) {
			int sum = s(i);
			if(sum < 10001) {
				b[sum] = true;
			}
		}

		StringBuilder sb = new StringBuilder();

		for(int i=1; i<10001; i++) {
			if(!b[i])
				sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
	public static int s(int a) {
		int sum = a;

		while(a != 0){
			sum += a % 10;
			a = a / 10;
		}
		return sum;
	}
}
//public class B_4673 {
//	public static void main(String[] args) {
//		System.out.println(s(10000));
//	}
//	static ArrayList<Integer> s(int a) {
//		ArrayList<Integer> arrayList = new ArrayList<Integer>(a);
//		for(int i=0; i<a; i++) {
//			arrayList.add(i + 1);
//		}
//		for(int i=0; i<a; i++) {
//			int total = i + 1;
//			int num = total;
//
//			while (num > 0) {
//				int r = num % 10;
//				num = num / 10;
//				total += r;
//			}
//			arrayList.remove(total-1);
//		}
//		return arrayList;
//	}
//}
