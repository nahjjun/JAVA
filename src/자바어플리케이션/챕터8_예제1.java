package 자바어플리케이션;
import java.awt.*;

import javax.swing.*;
public class 챕터8_예제1 extends JFrame{
	public 챕터8_예제1() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		this.setTitle("자바 프레임 만들기");
		this.setSize(300,400);
		setLocation(screenSize.width/2, screenSize.height/2); // 윈도우 창 위치 배치
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image img = kit.getImage("img/고양이.png");
		setIconImage(img);
		//setLayout(new FlowLayout());
		JButton button1 = new JButton("버튼1");
		button1.setBackground(Color.GREEN);
		JButton button2 = new JButton("버튼2");
		button2.setBackground(Color.GREEN);
		this.add(button1);
		this.add(button2);
		
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		챕터8_예제1 frame = new 챕터8_예제1();	
	}
}
