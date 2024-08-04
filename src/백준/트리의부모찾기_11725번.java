package 백준;
import java.util.*;
public class 트리의부모찾기_11725번 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] code = new int[2]; // code를 그때그때 받을 배열
		
		HashMap<Integer, Integer> entry = new HashMap<>();
		HashSet<Integer> confirmSet = new HashSet<>();
		entry.put(1, 1);
		for(int i=0; i<N-1; ++i) {
			code[0]=scan.nextInt();
			code[1]=scan.nextInt();
			confirmSet.add(code[0]);
			confirmSet.add(code[1]);
			
			int parent;
			int child;
			if(entry.containsKey(code[0])) { // 맵에 존재하면 부모인 것이다
				parent = code[0]; // 첫번째 숫자가 부모인 경우
				child = code[1];
			}
			else {
				parent = code[1];
				child = code[0];
			}
			entry.put(child, parent);
		}
		
		for(int i=2; i<=N; ++i) {
			System.out.println(entry.get(i));
		}
		scan.close();
	}
}
