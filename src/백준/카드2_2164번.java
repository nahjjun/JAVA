package 백준;
import java.util.*;
public class 카드2_2164번 {
	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=1; i<=N; ++i) q.add(i); // 큐에 데이터 전부 삽입
		
		while(q.size()>1) {
			q.poll();
			int tmp = q.poll();
			q.add(tmp);
		}
		System.out.println(q.poll());
		scan.close();
	}
}
