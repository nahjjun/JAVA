package 코테교재문제;
import java.util.*;
public class 챕터9_문제28_양과늑대 {
	public static int solution(int[] info, int[][] edges) {
        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < info.length; i++) {
            tree.add(new ArrayList<>());
        }

        // 트리의 부모, 자식 노드를 연결한다 
        for (int i = 0; i < edges.length; i++) {
            tree.get(edges[i][0]).add(edges[i][1]);
            tree.get(edges[i][1]).add(edges[i][0]);
        }
        
        boolean[] visited = new boolean[info.length]; // bfs는 해당 노드가 방문한 노드인지 확인해야하기 때문에, 노드를 방문했는지 확인하기 위한 배열

        // BFS를 사용하여 부모 노드를 찾음
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0); // 루트 노드부터 시작
        visited[0] = true;

        int sheeps=0;
        int wolves=0;
        
        while (!queue.isEmpty()) {
            int current = queue.poll(); // 큐에서 현재 검사할 노드 인덱스를 꺼내온다
            if(info[current] == 0) ++sheeps; // info 배열값이 0이면 양, 1이면 늑대의 개수를 증가시킨다.
            else ++wolves;
            for (int child : tree.get(current)) { // 해당 부모가 갖고있는 자식들을 전부 순회하면서 확인
                if (!visited[child]) {
                    // 방문하지 않은 노드를 큐에 넣는다
                    queue.add(child);
                    visited[child] = true;
                }
            }
            if(wolves>=sheeps) continue; // 만약 늑대의 수가 양의 수와 같거나 많아지면 더 이상 탐색할 수 없음
        }
     return sheeps;   
	}
	public static void main(String[] args) {
		int[] info= {0,0,1,1,1,0,1,0,1,0,1,1};
		int[][] edges = {{0,1},{1,2},{1,4},{0,8},{8,7},{9,10},{9,11},{4,3},{6,5},{4,6},{8,9}};
		
		System.out.println(solution(info,edges));
	}
}
