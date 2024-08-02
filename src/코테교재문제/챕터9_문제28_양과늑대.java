package 코테교재문제;
import java.util.*;
public class 챕터9_문제28_양과늑대 {
	public static int solution(int[] info, int[][] edges) {
		HashMap<Integer, ArrayList<Integer>> treeMap = new HashMap<>(); // key: 부모, value: 자식 노드들의 리스트 인 해시맵
		HashMap<Integer, Integer> parentTreeMap = new HashMap<>(); // key: 자식, value: 부모  데이터가 담긴 해시맵
		
		for(int i=0; i<edges.length; ++i) { // 각 노드에 연결되어있는 부모, 자식 관계를 각 key의 value 리스트에 저장
			ArrayList<Integer> tmp;
			if(!treeMap.containsKey(edges[i][0])) tmp = new ArrayList<>();
			else tmp = treeMap.get(edges[i][0]);
			tmp.add(edges[i][1]);
			treeMap.put(edges[i][0], tmp);
			
			parentTreeMap.put(edges[i][1], edges[i][0]); // 각 자식별로 부모가 누구인지 저장하는 해시맵에 데이터 저장
		}
		
		int current=0; // 순회를 진행할 인덱스 변수
		int sheeps=0;
		int wolves=0;
		int[] confirm = new int[info.length]; // 해당 인덱스가 읽혀졌는지 확인하기 위한 배열
		while(true) {
			// 현재 인덱스가 양이면 양 개수를, 늑대면 늑대 개수를 늘려준다.
			if(info[current]==0) ++sheeps;
			else ++wolves;
			
			// 좌측/우측 자식이 읽힌 노드인지 확인한다
			int left = treeMap.get(current).get(0);
			int right = treeMap.get(current).get(1);
			
			if(confirm[left]==1 && confirm[right]==1) { // 두 노드 모두 읽힌 경우
				// current 변수를 자신의 부모 노드로 
			}
			
			
			
		}
		
		
	}
}
