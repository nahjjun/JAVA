package 자바어플리케이션;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class 챕터9_타이머이벤트처리{
	static class innerClass implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println("beep");
		}	
	}
	
	public static void main(String[] args) {
		innerClass listener = new innerClass();
		Timer timer = new Timer(1000, listener); // listener의 actionPerformed() 함수를 1초에 한번씩 호출한다.
		timer.start();
		for(int i=0; i<1000; ++i) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			} // 1초동안 잤다가, 깨어나는 동작을 1000번 되풀이한다. 1초에 한번씩 호출되는지를 보기 위해 반복하는 것,
			// 단위는 밀리초이다.
			
		}
		
	}
	
}
