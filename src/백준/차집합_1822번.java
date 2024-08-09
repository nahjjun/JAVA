package 백준;
import java.util.*;
public class 차집합_1822번 {
	public static int[] set;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int A[] = new int[a];
		int B[] = new int[b];
		int max=0;
		HashSet<Integer> result = new HashSet<>();
		
		for(int i=0; i<a; ++i) {
			A[i] = scan.nextInt();
			max = Math.max(max, A[i]);
		}
		for(int i=0; i<b; ++i) {
			B[i] = scan.nextInt();
			max = Math.max(max, B[i]);
		}
		set = new int[max+1]; // 집합 생성
		for(int i=0; i<max+1; ++i) set[i]=i;
		for(int i=0; i<b-1; ++i) union(B[i],B[i+1]); // B 집합 생성

		
		
		for(int i=0; i<A.length; ++i) { // A 배열의 각 요소가 B 집합에 있는지 확인해야함
			boolean isTrue = true;
			for(int j=0; j<B.length; ++j) {
				if(find(B[j]) == find(A[i])) {
					isTrue=false;
					break;
				}
			}
			if(isTrue) result.add(A[i]);
		}
		
		
		int size = result.size();
		System.out.println(size);
		if(size>0)
			System.out.println(Arrays.toString(result.stream().mapToInt(Integer::intValue).toArray()));
		scan.close();
	}
	public static int find(int n) {
		if(set[n]==n) return n;
		return set[n] = find(set[n]); // 
	}
	public static void union(int n1, int n2) {
		int root1=find(n1);
		int root2=find(n2);
		if(root1 != root2) set[root2] = root1;
	}
}
