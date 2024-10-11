package 자바어플리케이션;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.*;

public class 챕터10_키패드만들기 extends JFrame{
	public 챕터10_키패드만들기() {
		setTitle("키패드 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JTextField text = new JTextField(30); 
		JPanel keyPad = new JPanel();
		keyPad.setLayout(new GridLayout(0,3,0,0));
		for(int i=1; i<=9; ++i) {
			JButton b = new JButton(""+i);
			b.addActionListener(e->{
				JButton tmp = (JButton)e.getSource();
				StringBuilder s = new StringBuilder(text.getText());
				s.append(tmp.getText());
				text.setText(s.toString());
			});
			keyPad.add(b);
		}
		add(text, BorderLayout.NORTH);
		add(keyPad, BorderLayout.CENTER);
		setPreferredSize(new Dimension(500,500));
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		챕터10_키패드만들기 a = new 챕터10_키패드만들기();
	}
}
