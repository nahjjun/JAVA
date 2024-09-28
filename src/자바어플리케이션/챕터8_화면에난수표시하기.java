package 자바어플리케이션;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class 챕터8_화면에난수표시하기 extends JFrame{
	private JPanel p;
	private JLabel[] label;
	
	public 챕터8_화면에난수표시하기() {
		setTitle("화면에 난수 표시하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		p.setLayout(null);
		p.setBackground(Color.yellow);
		label = new JLabel[30];
		
		for(int i=0; i<30; ++i) {
			int randX = (int)(Math.random()*500); 
			int randY = (int)(Math.random()*400);
			label[i] = new JLabel(String.valueOf(i));
			label[i].setSize(20,20);
			label[i].setLocation(randX,randY);
			label[i].setForeground(Color.red);
			p.add(label[i]);
		}
		add(p);
		setPreferredSize(new Dimension(500,400));
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		챕터8_화면에난수표시하기 a = new 챕터8_화면에난수표시하기();
	}
}
