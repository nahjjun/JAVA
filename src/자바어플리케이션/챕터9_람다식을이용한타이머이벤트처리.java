package 자바어플리케이션;
import javax.swing.Timer;
public class 챕터9_람다식을이용한타이머이벤트처리{
	public static void main(String[] args) {
		Timer timer = new Timer(500, (e)->{
			System.out.println("beep");
		});
		timer.start();
		for(int i=0; i<10; ++i) {
			try {
				Thread.sleep(500); // 1000밀리초(1초) 동안 프로그램을 일시 정지 시킨다.
				// 즉, 타이머는 매 1초마다 beep를 출력하고, 위 코드는 메인 스레드가 1초 동안 대기 하도록 한다.
			} catch(InterruptedException e) {
			}
		}
	}
}
