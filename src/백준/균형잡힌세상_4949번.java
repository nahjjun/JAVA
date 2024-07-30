package 백준;
import java.util.*;
public class 균형잡힌세상_4949번 {
	public static boolean solution(String _s) {
		Stack<Character> stack = new Stack<>();
		for(char c : _s.toCharArray()) {
			if(c == '.') break;
			if(!(c == '(' || c == '[' || c == ')' || c == ']')) continue;
			
			if(stack.isEmpty()) { // 스택이 비었다면
				if(c == '(' || c == '[') stack.push(c);
				else return false;
			}
			else {
				char tmp = stack.peek();
				if(tmp == '(') {
					if(c == ')') stack.pop();
					else if(c == ']') return false;
					else stack.push(c);
				}
				else if(tmp == '[') {
					if(c == ']') stack.pop();
					else if(c == ')') return false;
					else stack.push(c);
				}
			}
		}
		return stack.isEmpty(); 
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Boolean> result = new ArrayList<>();
		String s = new String();
		
		while(true) {
			s=scan.nextLine();
			if(s.charAt(0) == '.') break;
			if(solution(s)) result.add(true);
			else result.add(false);
		}
		
		for(Boolean b:result) {
			if(b) System.out.println("yes");
			else System.out.println("no");
		}
			
		scan.close();
	}
}
