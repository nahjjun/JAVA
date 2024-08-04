package 백준;
import java.util.*;

public class 트리의부모찾기_11725번 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            tree.add(new ArrayList<>());
        }

        // 트리의 간선을 입력받아 양방향으로 저장
        for (int i = 0; i < N - 1; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            tree.get(a).add(b);
            tree.get(b).add(a);
        }
        
        // 부모 노드를 저장할 배열
        int[] parent = new int[N + 1]; // 인덱스가 자식, 해당 인덱스에 있는 데이터가 부모이다.
        boolean[] visited = new boolean[N + 1]; // bfs는 해당 노드가 방문한 노드인지 확인해야하기 때문에, 노드를 방문했는지 확인하기 위한 배열

        // BFS를 사용하여 부모 노드를 찾음
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); // 루트 노드부터 시작
        visited[1] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int child : tree.get(current)) { // 해당 부모가 갖고있는 자식들을 for문으로 전부 순회하면서 확인
                if (!visited[child]) {
                    visited[child] = true;
                    parent[child] = current; // 부모 노드 저장
                    queue.add(child); // 큐에 넣는다
                }
            }
        }
        
        // 2번 노드부터 N번 노드까지 부모 노드를 출력
        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
        
        scan.close();
    }
}
