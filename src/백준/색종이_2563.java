package 백준;
import java.util.*;
public class 색종이_2563 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] array = new int[101][101];
		int count=0;
		for(int i=0; i<N; ++i) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			for(int j=x; j<x+10; ++j) {
				for(int k=y; k<y+10; ++k) {
					if(array[j][k] == 0) {
						array[j][k] = 1;
						++count;
					}
				}
			}
		}
		System.out.println(count);
		scan.close();
	}
}
