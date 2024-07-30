package 백준;
import java.util.*;
public class 바구니뒤집기_10811 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(), M = scan.nextInt();
		ArrayList<Integer> result = new ArrayList<>();
		for(int c=1; c<=N; c++) {
			result.add(c);	
		}
		
		int i,j;
		for(int c=0; c<M; c++) {
			i=scan.nextInt()-1;
			j=scan.nextInt()-1;
			while(i<j) {
				int tmp = result.get(i);
				result.set(i, result.get(j));
				result.set(j, tmp);
				++i;
				--j;
			}
		}
		scan.close();
		
		for(i=0; i<result.size(); ++i) {
			System.out.print(result.get(i)+" ");
		}
		
	}
}
