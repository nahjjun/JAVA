package 백준;
import java.util.*;
public class 트럭_13335번 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), w = scan.nextInt(), L = scan.nextInt();
		Queue<Integer> trucks = new ArrayDeque<>(); // 들어서기 전 트럭들
		int[] trucksCount = new int[n];// 각 트럭들이 갖고있는 카운트 수(다리 위에서 1턴을 있어야 하는데, 해당 카운트를 구분하기 위한 것)
		Queue<Integer> bridge = new ArrayDeque<>(); // 다리
		
		for(int i=0; i<n; ++i) {
			trucks.add(scan.nextInt());
		}
		
		int time = 0; // 걸리는 시간
		int i = 0; // 몇번째 트럭을 검사하는지 구분하기 위한 인덱스
		while(!(trucks.isEmpty() && bridge.isEmpty())) { // 다리와 trucks가 전부 비어있으면 다리를 전부 건넌 것이므로 종료한다
			if(bridge.isEmpty()) { // 다리가 완전히 빈 경우
				if(trucks.peek() <= L) {
					bridge.add(trucks.poll()); // 트럭의 무게가 다리 최대 수용 무게를 넘지 않으면 트럭 한대를 입장시킴
				}
					
			}
			else { // 다리가 비지 않은 경우
				while(!bridge.isEmpty() && trucksCount[i] == w) {// 다리에서 내려와야할 트럭이 있는지 검사한다(trucksCount 값이 2이면 다리에서 내려와야함)
					bridge.poll(); // 다리에서 트럭을 내림
					++i; // 다음으로 검사할 트럭
				}
				
				// 다리에서 트럭을 내렸다면, 올릴 수 있는 트럭을 찾아야한다.
				if(bridge.size() <= w) {
					int sum = 0; // 다리에 올라가있는 트럭의 무게 측정
					for(int b:bridge) sum += b;
					if(!trucks.isEmpty() && sum+trucks.peek() <= L)
						bridge.add(trucks.poll()); // 트럭의 무게가 다리 최대 수용 무게를 넘지 않으면, 트럭을 다리로 옮긴다.
				}
			}
			
			for(int a=i; a<bridge.size()+i; ++a) {
				trucksCount[a]++; // 다리에 올라가 있는 트럭의 횟수를 증가시킨다. 
			}
			++time; // 트럭 입장에는 1초의 시간이 든다
		}
		
		System.out.println(time);
		
		scan.close();
	}
}
