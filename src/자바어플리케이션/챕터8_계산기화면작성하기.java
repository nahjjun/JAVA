package 자바어플리케이션;
import java.awt.*;
import javax.swing.*;
public class 챕터8_계산기화면작성하기 extends JFrame{
	private JTextField setText;
	private JPanel setKeypad; 
	private JButton[] buttons;
	private String[] calculate = {
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "*", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "="
	};
	
	public 챕터8_계산기화면작성하기() {
		setTitle("계산기 화면 작성하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		setText = new JTextField(35); 
		setKeypad = new JPanel();
		setKeypad.setLayout(new GridLayout(5,5,2,2));
		buttons = new JButton[25];
		int i=0;
		for(String s:calculate) {
			buttons[i] = new JButton(s);
			if((i+1)%5 == 0 || (i+1)%5 == 4) buttons[i].setForeground(Color.RED);
			else buttons[i].setForeground(Color.BLACK);
			buttons[i].setBackground(Color.yellow);
			setKeypad.add(buttons[i]);
			++i;
		}
		
		add(setText, BorderLayout.NORTH);
		add(setKeypad, BorderLayout.CENTER);
		
		setPreferredSize(new Dimension(600,300));
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		챕터8_계산기화면작성하기 a = new 챕터8_계산기화면작성하기();
	}
}
