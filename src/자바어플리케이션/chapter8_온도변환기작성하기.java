package 자바어플리케이션;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class chapter8_온도변환기작성하기 extends JFrame{
	public chapter8_온도변환기작성하기() {
		setTitle("온도 변환기 작성하기");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		JLabel j1 = new JLabel("화씨온도");
		JLabel j2 = new JLabel("섭씨온도");
		
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		
		JButton b = new JButton("변환");
		b.addActionListener(new chapter8_온도변환기작성하기_eventListener(t1,t2));
		
		p1.add(j1);
		p1.add(t1);
		p2.add(j2);
		p2.add(t2);
		p3.add(b);
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		chapter8_온도변환기작성하기 frame = new chapter8_온도변환기작성하기();
	}
}
