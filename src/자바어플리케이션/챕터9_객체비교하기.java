package 자바어플리케이션;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class 챕터9_객체비교하기 implements Comparable{
	private int width, height;
	public 챕터9_객체비교하기(int width, int height) {
		this.height = height;
		this.width= width;
	}
	public 챕터9_객체비교하기() { this(0,0); }
	public int getArea() {return width*height;}
	
	
	@Override
	public int compareTo(Object obj) {
		챕터9_객체비교하기 otherRect = (챕터9_객체비교하기)obj;
		if(this.getArea() < otherRect.getArea()) return -1;
		else if(this.getArea() > otherRect.getArea()) return 1;
		else return 0;
	}
	
	public static void main(String[] args) {
		챕터9_객체비교하기 r1 = new 챕터9_객체비교하기(100,30);
		챕터9_객체비교하기 r2 = new 챕터9_객체비교하기(200,10);
		
		if(r1.compareTo(r2) == -1) System.out.println("2번 사각형이 더 큽니다.");
		else if(r1.compareTo(r2) == 1) System.out.println("1번 사각형이 더 큽니다.");
		else System.out.println("두 사각형의 넓이가 같습니다.");
	}
}
