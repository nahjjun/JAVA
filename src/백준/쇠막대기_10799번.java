package 백준;
import java.io.*;
import java.util.*;
public class 쇠막대기_10799번 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<>();
		int count=0;
		String s = br.readLine();
		for(int i=0; i<s.length(); ++i) {
			if(s.charAt(i) == '(') stack.push(s.charAt(i));
			else {
				stack.pop();
				if(s.charAt(i-1) == '(') count += stack.size();
				else ++count;
			}
		}
		bw.write(count+"\n"); // '\n' 를 사용하게 되면, 문자열과 문자열을 연결하는게 아니라, 정수 count와 문자'\n'의 유니코드값이 연산을 하므로, 문자열이 제대로 출력되지 않는 것이다.
		
		bw.flush();
		br.close();
		bw.close();
	}
}
