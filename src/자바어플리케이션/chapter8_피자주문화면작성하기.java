package 자바어플리케이션;
import javax.swing.*;
import java.util.*;
public class chapter8_피자주문화면작성하기 extends JFrame{
	public chapter8_피자주문화면작성하기() {
		setTitle("피자 주문 화면 작성하기");
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel title = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2= new JPanel();
		
		JLabel t = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오."); 
		JButton b1 = new JButton("콤보피자");
		JButton b2 = new JButton("포테이토피자");
		JButton b3 = new JButton("불고기피자");
		
		JLabel j1 = new JLabel("개수");
		JTextField j2 = new JTextField(20);
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
	}
}
