package 자바어플리케이션;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class 챕터10_키패드만들기 extends JFrame implements ActionListener{
	private JTextField txt;
	private JPanel panel;
	
	public 챕터10_키패드만들기() {
		setTitle("키패드 만들기");
		setLayout(new BorderLayout());
		txt = new JTextField(20);
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3,0,0));
		add(panel, BorderLayout.CENTER);
		add(txt, BorderLayout.NORTH);
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(String.valueOf(i));
			b.addActionListener(this);
			panel.add(b);	
		}
		
		setPreferredSize(new Dimension(400,400));
		pack();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getActionCommand()로 버튼 위에 있는 문자열을 반환받는다. (버튼 클릭과 같은 액션 이벤트에서 어떤 명령을 발생시켰는지 알아낼 때 사용된다.)
		String actionCommand = e.getActionCommand();  
		txt.setText(txt.getText() + actionCommand);
	}
	
	public static void main(String[] args) {
		new 챕터10_키패드만들기();
	}
}
