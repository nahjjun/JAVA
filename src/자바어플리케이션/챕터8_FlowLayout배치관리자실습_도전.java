package 자바어플리케이션;

import java.awt.*;
import javax.swing.*;

public class 챕터8_FlowLayout배치관리자실습_도전 extends JFrame{ 
	public 챕터8_FlowLayout배치관리자실습_도전() {
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 3, 0, 0)); // 행, 열, 격자 사이의 공간을 생성자의 인자로 줄 수 있다.
		
		JButton b[] = new JButton[10];
		for(int i=0; i<10; ++i) {
			b[i] = new JButton("Button" + Integer.valueOf(i));
			this.add(b[i]);
		}
		
		
		setPreferredSize(new Dimension(300,200));
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		챕터8_FlowLayout배치관리자실습_도전 a = new 챕터8_FlowLayout배치관리자실습_도전();
	}
}
