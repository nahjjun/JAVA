package 자바어플리케이션;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class 챕터9_자율주행자동차 implements 챕터9_자율주행자동차2{
	@Override
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}
	public void setSpeed(int speed) {
		System.out.println("자동차가 방향을 " + speed + "km/h로 바꿉니다.");
	}
	public void turn(int degree) {
		System.out.println("자동차가 방향을 " + degree + "km/h로 바꿉니다.");
	}
	
	public static void main(String[] args) {
		챕터9_자율주행자동차 a = new 챕터9_자율주행자동차();
		a.start();
		a.setSpeed(50);
		a.turn(100);
		a.stop();
		
	}
}
