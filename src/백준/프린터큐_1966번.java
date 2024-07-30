package 백준;
import java.util.*;
public class 프린터큐_1966번 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0; i<T; ++i) {
			int N = scan.nextInt(), M = scan.nextInt();;
			Queue<Integer> q = new ArrayDeque<>(), arr = new ArrayDeque<>();
			Queue<Integer> result = new ArrayDeque<>();
			Queue<Integer> top = new PriorityQueue<>(Comparator.reverseOrder());
			
			for(int j=0; j<N; ++j) {
				q.add(j);	// 큐에 문서 이름들 삽입
				int tmp = scan.nextInt();
				arr.add(tmp); // 문서별 중요도 입력
				top.add(tmp); // 정렬된 문서별 중요도
			} 

			while(!q.isEmpty()) { // 큐가 빌 때까지 인쇄 작업 진행
				if(arr.peek() < top.peek()) { // 현재 문서보다 중요도가 큰 문서가 있는 경우
					arr.add(arr.poll());
					q.add(q.poll());
				}
				else { // 현재 문서보다 중요도가 큰 문서가 없는 경우
					result.add(q.poll());
					arr.poll();
					top.poll();
				}
			}
			int count=1;
			while(!result.isEmpty()) {
				if(M == result.poll()) {
					System.out.println(count);
				}
				else {
					++count;
				}
			}
			
		}
		
		
		
		
		scan.close();
	}
}
