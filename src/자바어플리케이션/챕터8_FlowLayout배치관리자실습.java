package 자바어플리케이션;

import java.awt.*;
import javax.swing.*;

public class 챕터8_FlowLayout배치관리자실습 extends JFrame{ 
	public 챕터8_FlowLayout배치관리자실습() {
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
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
		챕터8_FlowLayout배치관리자실습 a = new 챕터8_FlowLayout배치관리자실습();
	}
}
