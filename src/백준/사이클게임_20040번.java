package 백준;
import java.util.*;
public class 사이클게임_20040번 {
	public static int[] set; // 집합 배열
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt(), m=scan.nextInt();
		int[][] command = new int[m][2]; // 명령을 받을 배열
		for(int i=0; i<m; ++i) {
			command[i][0] = scan.nextInt();
			command[i][1] = scan.nextInt();
		}
		set = new int[n]; // n만큼 집합 배열 생성
		for(int i=0; i<n; ++i) set[i] = i; // 집합 배열의 각 부모를 자기 자신으로 설정(초기화)
		
		
		scan.close();
	}
	public static int find(int n) {
		if()
	}
	public static void union(int n1, int n2) {
		
	}
}
