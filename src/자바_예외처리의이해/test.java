package 자바_예외처리의이해;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class test extends JFrame implements KeyListener{
	
	public test(){
		setTitle("title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		addKeyListener(this);
		setFocusable(true);
		requestFocus();
		
		
		
		setPreferredSize(new Dimension(300,300));
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		test t=new test();
		
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Pressed");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
