package 자바어플리케이션;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JTextField;

public class chapter8_온도변환기작성하기_eventListener implements ActionListener{
	private JTextField t1;
	private JTextField t2;
	private double Fahrenheit; // 화씨 온도 저장
	private double Celsius; // 섭씨 온도 저장
	public chapter8_온도변환기작성하기_eventListener(JTextField t1, JTextField t2) {
		this.t1 = t1;
		this.t2 = t2;		
	}
	
	public void transfer() {
		this.Fahrenheit = Double.parseDouble(t1.getText()); // parseInt로 해당 문자열을 숫자로 변환
		BigDecimal num1 = new BigDecimal("32.0"); // 정확한 실수 계산을 위해 BigDecimal 객체를 사용
		BigDecimal num2 = new BigDecimal("5.0");
		BigDecimal num3 = new BigDecimal("9.0");
		BigDecimal F = new BigDecimal(Fahrenheit);
		BigDecimal result =F.subtract(num1).multiply(num2).divide(num3, 5, RoundingMode.HALF_UP);
		// ㄴ> 340을 9로 나누면 무한소수가 나오므로 자동으로 "ArithmeticException" 오류를 throw한다. 따라서 인자를 주어서
		// "몇번째 자리에서 반올림할건지" 와 "반올림과 반내림 중 무얼 할건지"를 인자로 주어야한다.
		 
		Celsius = result.doubleValue();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		transfer();
		t2.setText(Double.toString(Celsius));
	}
}
