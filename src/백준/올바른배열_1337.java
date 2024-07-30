package 백준;
import java.util.*;
public class 올바른배열_1337 {
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> array = new ArrayList<>();
		for(int i=0; i<N; ++i) {
			array.add(scan.nextInt());
		}
		Collections.sort(array);
		
		int startIdx = 0;
		int currentCount = 0, postCount=0;
		for(int i=0; i<N-1; ++i) {
			if(array.get(startIdx).equals(array.get(startIdx+1)-1)) {
				++currentCount;
			}
			else {
				if(postCount < currentCount) {
					postCount = currentCount;	
				}
				currentCount = 0;
			}
			++startIdx;
		}
		scan.close();
		if(currentCount == 0) {
			System.out.println(5-postCount);
		}
		else {
			System.out.println(currentCount);
		}
		// 1. 이 배열이 연속적인 조건을 만족하는지 확인해야함
// 		1-1. 입력을 받고 정렬
//		1-2. 입력이 끝나면, 반복문으로 연속하는지 확인
// 2. 만약 연속적인 조건을 만족하지 않는 경우, 해당 배열에서 연속된 수가 가장 많은 집합을 찾는다.

		*/
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Integer> array = new ArrayList<>();
		for(int i=0; i<N; ++i) {
			array.add(scan.nextInt());
		}
		Collections.sort(array);
		
		int tmp=0;
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0; i<N; ++i) {
			tmp=0; 
			for(int j=array.get(i); j<array.get(i)+5; ++j) {
				if(array.contains(j))
					++tmp;
			}
			result.add(tmp);
		}
		System.out.println(5-Collections.max(result));
		
		scan.close();
	}
}

