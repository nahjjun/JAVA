package 백준;
import java.util.*;
public class 단어순서뒤집기_12605번 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine(); // 버퍼 비우기
		StringBuilder result[] = new StringBuilder[N];
		
		for(int i=0; i<N; ++i) {
			result[i] = new StringBuilder();
			String s = scan.nextLine();
			Stack<String> stack = new Stack<>();
			String[] words = s.split(" "); 
			for(String w:words) {
				stack.push(w);
			}
			
			result[i].append("Case #"+(i+1)+": ");
			while(!stack.isEmpty()) {
				result[i].append(stack.pop());
				result[i].append(" ");
			}
		}
		
		for(StringBuilder s:result) {
			System.out.print(s);
			System.out.println("");
		}
		scan.close();
	}
}
