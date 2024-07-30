package 백준;
import java.util.*;

public class 뱀_3190번 {
	public static class Pair<First, Second>{
		private First first;
		private Second second;
		
		public Pair(First _first, Second _second) {
			first = _first;
			second = _second; 
		}
		public First getFirst() {
			return first;
		}
		public Second getSecond() {
			return second;
		}
		public void setFirst(First _first) {
			first = _first;
		}
		public void setSecond(Second _second) {
			second = _second; 
		}
		
		public boolean equals(Pair<First, Second> _p) { // 다른 Pair객체와 같으면 true를 반환하는 함수
			if(this.first == _p.getFirst() && this.second == _p.getSecond()) return true;
			else return false;
		}
	}
	
	public static boolean isEnded(Deque<Pair<Integer, Integer>> _snake, int _N) { // 게임이 끝났는지 확인하는 함수
		Pair<Integer, Integer> head = _snake.peekLast();
		if(head.getFirst()>_N || head.getFirst()<1 || head.getSecond()>_N || head.getSecond()<1) { // 머리가 지정된 행렬을 넘어간 경우
			return true;
		}
		
		// 머리가 자신의 몸통과 부딪히는지 확인
		if(_snake.size() < 5) return false; // 만약 뱀의 길이가 5 미만이면 몸통과 부딪힐 수 없기에 false 반환
		Iterator<Pair<Integer, Integer>> iterator = _snake.iterator(); // iterator를 통해서 Deque의 각 요소들을 순회
		for(int i=0; i<_snake.size()-4; ++i) { // 물리적으로 머리와 그 이후 3개까지는 부딪힐 수 없음
			Pair<Integer, Integer> element = iterator.next(); // iterator로 각 Pair 요소들을 받는다
			if(head.equals(element)) return true; // 머리가 iterator로 받은 객체와 같다면 true 반환
		}
		return false;
	}
	
	// 머리가 사과에 도달했는지 확인하는 함수 
	public static boolean isApple(Pair<Integer, Integer> _head, List<Pair<Integer, Integer>> _apple) {
		for(int a=0; a<_apple.size(); ++a) {
			if(_head.equals(_apple.get(a))) {
				_apple.remove(a); // 사과를 먹었으면, 사과를 리스트에서 삭제한다.
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // 보드의 크기
		int K = scan.nextInt(); // 사과의 개수
		List<Pair<Integer, Integer>> apples = new ArrayList<>(); // 사과가 있는 좌표를 받을 apples 배열
		for(int i=0; i<K; ++i) {
			int row = scan.nextInt(), col = scan.nextInt(); // 사과의 행, 열 데이터를 받고
			apples.add(new Pair<Integer, Integer>(row,col)); // Pair 객체로 만들어서 apples List에 넣는다
		}
		
		// 사과의 주소를 전부 받았으니, 이제 회전 명령어를 받을 차례이다.
		int L = scan.nextInt();
		Queue<Pair<Integer, Character>> commands = new ArrayDeque<>(); // 회전을 할 타이밍과 방향을 저장해놓는 큐
		for(int i=0; i<L; ++i) {
			int time = scan.nextInt(); // 회전할 타이밍
			String tmp = scan.next();
			Character turn = tmp.charAt(0); // 회전할 방향
			commands.add(new Pair<Integer, Character>(time, turn)); // 회전 명령어의 시간과 방향을 Pair 객체로 만들어서 Queue에 넣는다.	
		}
		
		// 회전 명령도 전부 받았으므로, 이제 움직임을 수행해야한다
		Deque<Pair<Integer, Integer>> snake = new ArrayDeque<>(); // 뱀의 위치를 갱신하기 위한 큐
		snake.add(new Pair<Integer,Integer>(1,1)); // 초기 위치(1행 1열)
		
		int time = 0; // 게임 수행 시간
		int direction = 1; // 0이면 위, 1이면 오른쪽, 2면 아래, 3이면 왼쪽
		while(true) { // 끝나지 않았다면 게임 진행
			if(!commands.isEmpty() && time == commands.peek().getFirst()) { // 회전 시간에 도달했을 때, 머리의 진행 방향을 결정하는 조건문
				Pair<Integer, Character> tmp = commands.poll();
				if(tmp.getSecond() == 'D') direction = (direction+1)%4;
				else if(tmp.getSecond() == 'L') {
					if(direction == 0) direction = 3;
					else --direction;
				}
			}
			
			Pair<Integer, Integer> head = snake.peekLast(); // 이동시키기 전 머리를 가져옴
			// 회전을 시켰다면, 해당 방향으로 앞으로 진행시켜야함
			switch(direction) {
			case 0: // 위쪽
				snake.add(new Pair<Integer, Integer>(head.getFirst()-1, head.getSecond())); // Deque에 새로운 머리를 추가해준다.
				break;
			case 1: // 오른쪽
				snake.add(new Pair<Integer, Integer>(head.getFirst(), head.getSecond()+1));
				break;
			case 2: // 아래쪽
				snake.add(new Pair<Integer, Integer>(head.getFirst()+1, head.getSecond()));
				break;
			case 3: // 왼쪽
				snake.add(new Pair<Integer, Integer>(head.getFirst(), head.getSecond()-1));
				break;
			}
			head = snake.peekLast();
			// 머리를 앞으로 진행시켰을 때, 삭제하기 이전 꼬리를 포함해서 자신에게 부딪혔는지, 벽에 부딪혔는지 확인해야함
			if(isEnded(snake, N)) break;
			
			// 머리를 앞으로 진행시켜줬다면, 해당 자리에 사과가 있는지 확인한다
			if(!isApple(head, apples)) snake.poll(); // 머리가 사과를 만나지 않은 경우, 제일 앞에 있는 값을 poll해준다
			++time;
		}
		++time; // 부딪히는 경우까지 포함
		
		System.out.println(time);
		scan.close();
	}
}
