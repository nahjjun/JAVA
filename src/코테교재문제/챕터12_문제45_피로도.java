package 코테교재문제;
import java.util.*;
public class 챕터12_문제45_피로도 {

	public static int solution(int k, int[][] dungeons) {
		int result=0;
		for(int i=0; i<dungeons.length; ++i) {
			int tmp=0;
			ArrayList<Integer> rDungeons = new ArrayList<>();
			for(int j=0; j<dungeons.length; ++j) rDungeons.add(0); 
			tmp = backtracking(i,tmp, rDungeons, dungeons, k); // 백트래킹으로 해당 던전으로 시작했을 때 나올 결과를 tmp로 반환 
			result  = Integer.max(result, tmp);
		}
		return result;
	}
	
	public static boolean canGetIn(int start, int k) {return start>=k;}
	
	// start: 시작 던전, result: 해당 던전을 시작으로 했을 때 돌 수 있는 던전의 수
	//rDungeons: 남은 던전 리스트, k: 남은 피로도
	public static int backtracking(int start, int result, ArrayList<Integer> rDungeons, int[][] dungeons, int k) {   
		if(canGetIn(start, k)) rDungeons.remove(Integer.valueOf(start));// 만약 현재 던전이 피로도 조건에 맞는다면 rDungeons 리스트에서 제외한다.
	}
}
