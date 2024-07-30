package 백준;
import java.util.*;
public class 이차원배열의합_2167 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt(), M=scan.nextInt();
		ArrayList<Integer>[] array = new ArrayList[N];
		for(int i=0; i<N; ++i) {
			array[i] = new ArrayList<>();
			for(int j=0; j<M; ++j) {
				int tmp = scan.nextInt();
				array[i].add(tmp);	
			}
		}
		int K = scan.nextInt();
		int sum[] = new int[K];
		for(int c=0; c<K; ++c) {
			int i = scan.nextInt()-1, j=scan.nextInt()-1, x=scan.nextInt()-1, y=scan.nextInt()-1;
			for(int a=i; a<=x; ++a) {
				for(int b=j; b<=y; ++b) {
					sum[c] += array[a].get(b);	
				}
			}
		}
		scan.close();
		for(int i=0; i<K; ++i) {
			System.out.println(sum[i]);
		}
	}
}
